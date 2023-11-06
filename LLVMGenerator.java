import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

class LLVMGenerator{
   
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int br = 0;
   static int main_reg = 1;
   static String buffer = "";

   static Stack<Integer> brstack = new Stack<Integer>();

   static void printf_i32(String id, Boolean global){
//      if(global){
//         buffer += "%"+reg+" = load i32, i32* @"+id+"\n";
//      }
//      else{
//         buffer += "%"+reg+" = load i32, i32* %"+id+"\n";
//      }
//      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_double(String id, Boolean global){
      if(global){
         buffer += "%"+reg+" = load double, double* @"+id+"\n";
      }
      else{
         buffer += "%"+reg+" = load double, double* %"+id+"\n";
      }
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_string(String id, int len) {
      String stringt = "[" + len + " x i8]";
      buffer += "%"+reg+" = getelementptr inbounds"+stringt+", "+stringt+"* @"+id+", i32 0, i32 0\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_tabi32(String id, TerminalNode i, Integer size) {
      buffer+= "%" + reg + " = getelementptr inbounds ["+size+" x i32],["+size+" x i32]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer += "%"+reg+" = load i32, i32* %" +  (reg - 1) + "\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_tabdouble(String id, TerminalNode i, Integer size) {
      buffer+= "%" + reg + " = getelementptr inbounds ["+size+" x double],["+size+" x double]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer += "%"+reg+" = load double, double* %" +  (reg - 1) + "\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void scanf_i32(String id) {
      buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %"+id+")\n";
      reg++;
   }

   static void scanf_double(String id) {
      buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %"+id+")\n";
      reg++;
   }

   static void icmp_i32(String val1, String val2, String op) {
      buffer += "%"+reg+" = icmp "+op+" i32 "+val1+", "+val2+"\n";
      reg++;
   }


    static void fcmp_double(String val1, String val2, String op) {
      buffer += "%"+reg+" = fcmp "+op+" double "+val1+", "+val2+"\n";
      reg++;
   }


   static void forstart(String value) {
      declare_i32(Integer.toString(reg), false);
      int counter = reg;
      reg++;
      assign_i32(Integer.toString(counter), "0", false);
      br++;
      buffer += "br label %cond"+br+"\n";
      buffer += "cond"+br+":\n";

      load_i32(Integer.toString(counter), false);
      add_i32("%"+(reg-1), "1");
      assign_i32(Integer.toString(counter), "%"+(reg-1), false);

      buffer += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+value+"\n";
      reg++;

      buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      buffer += "true"+br+":\n";
      brstack.push(br);
   }

    static void forend() {
      int b = brstack.pop();
      buffer += "br label %cond"+b+"\n";
      buffer += "false"+b+":\n";
   }

    static void ifstart() {
      br++;
      buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      buffer += "true"+br+":\n";
      brstack.push(br);
   }

    static void ifend() {
      int b = brstack.pop();
      buffer += "br label %false"+b+"\n";
      buffer += "false"+b+":\n";
   }

   static void funcstart_i32(String id) {
      main_text += buffer;
      main_reg = reg;
      buffer = "define i32 @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void funcstart_double(String id) {
      main_text += buffer;
      main_reg = reg;
      buffer = "define double @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void funcend_i32(String id) {
      buffer += "%"+reg+" = load i32, i32* %" + id + "\n";
      buffer += "ret i32 %"+reg+"\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

   static void funcend_double(String id) {
      buffer += "%"+reg+" = load double, double* %" + id + "\n";
      buffer += "ret double %"+reg+"\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

   static void doFunc_i32(String id) {
      buffer += "%"+reg+" = call i32 @"+id+"()\n";
      reg++;
   }

   static void doFunc_double(String id) {
      buffer += "%"+reg+" = call double @"+id+"()\n";
      reg++;
   }

   static void declare_i32(String id, Boolean global){
      if(global){
         header_text += "@"+id+" = global i32 0\n";
      }
      else{
         buffer += "%"+id+" = alloca i32\n";
      }
   }

   static void declare_double(String id, Boolean global){
      if(global){
         header_text += "@"+id+" = global double 0.0\n";
      }
      else{
         buffer += "%"+id+" = alloca double\n";
      }

   }

   static void declare_i32_tab(String id, Integer size, Boolean global) {
      if(global){
         header_text+= "@" + id + " = common dso_local global ["+size+" x i32] zeroinitializer, align 16\n";
      }
      else{
         buffer+= "%" + id + " = alloca["+size+"x i32], align 16\n";
      }
   }

   static void declare_double_tab(String id, Integer size, Boolean global) {
      if(global){
         header_text+= "@" + id + " = common dso_local global ["+size+" x double] zeroinitializer, align 16\n";
      }
      else{
         buffer+= "%" + id + " = alloca["+size+"x double], align 16\n";
      }

   }


   static void assign_i32(String id, String value, Boolean global){
      if(global){
         buffer += "store i32 "+value+", i32* @"+id+"\n";
      }
      else{
         buffer += "store i32 "+value+", i32* %"+id+"\n";
      }

   }

   static void assign_double(String id, String value, Boolean global){
      if(global){
         buffer += "store double "+value+", double* @"+id+"\n";
      }
      else{
         buffer += "store double "+value+", double* %"+id+"\n";
      }

   }

   static void assign_string(String id, String value, Boolean global) {
      String value2 = value.substring(1, value.length() - 1);
      int len = value2.length() + 1;
      String stringt = "[" + len + " x i8]";
      if(global){
         header_text += "@"+id+" = constant"+stringt+" c\""+value2+"\\00\"\n";
      }
      else{
         header_text += "@"+id+" = constant"+stringt+" c\""+value2+"\\00\"\n";
      }
      }

   static void assign_i32_tab(String id, Integer size, int i, String elem) {
      buffer+= "%" + reg + " = getelementptr inbounds ["+size+" x i32],["+size+" x i32]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer+= "store i32 "+elem+", i32* %" +  (reg - 1) + "\n";
   }

   public static void assign_double_tab(String id, Integer size, int i, String elem) {
      buffer+= "%" + reg + " = getelementptr inbounds ["+size+" x double],["+size+" x double]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer+= "store double "+elem+", double* %" +  (reg - 1) + "\n";
   }



   static void load_i32(String id, Boolean global){
      if(global){
         buffer += "%"+reg+" = load i32, i32* @"+id+"\n";
      }
      else{
         buffer += "%"+reg+" = load i32, i32* %"+id+"\n";
      }

      //String id2 = "%"+reg;
      reg++;
      //return id2;
   }

   static void load_double(String id, Boolean global){
      if(global){
         buffer += "%"+reg+" = load double, double* @"+id+"\n";
      }
      else{
         buffer += "%"+reg+" = load double, double* %"+id+"\n";
      }

      //String id2 = "%"+reg;
      reg++;
      //return id2;
   }

   static void load_tabi32(String id, Integer size, Integer i) {
      buffer += "%" + reg + " = getelementptr inbounds ["+size+" x i32],["+size+" x i32]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer += "%" + reg + " = load i32, i32* %" + (reg-1) + ", align 4\n";
      reg++;
   }

   static void load_tabdouble(String id, Integer size, Integer i) {
      buffer+= "%" + reg + " = getelementptr inbounds ["+size+" x double],["+size+" x double]* @" + id + ", i32 0, i32 "+i+"\n";
      reg++;
      buffer += "%" + reg + " = load double, double* %" + (reg-1) + ", align 4\n";
      reg++;
   }

   static void add_i32(String val1, String val2){
      buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_double(String val1, String val2){
      buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_i32(String val1, String val2) {
      buffer += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_double(String val1, String val2) {
      buffer += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
      reg++;
   }


   static void mult_i32(String val1, String val2){
      buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

   public static void div_i32(String val1, String val2) {
      buffer += "%"+reg+" = sdiv i32 "+val1+", "+val2+"\n";
      reg++;
   }

   public static void div_double(String val1, String val2) {
      buffer += "%"+reg+" = fdiv double "+val1+", "+val2+"\n";
      reg++;
   }

   static void sitofp(String id){
      buffer += "%"+reg+" = sitofp i32 "+id+" to double\n";
      reg++;
   }

   static void fptosi(String id){
      buffer += "%"+reg+" = fptosi double "+id+" to i32\n";
      reg++;
   }

   public static void redefined_i32(String id, String val, Boolean global) {
      buffer += "%"+id+" = fptosi double 0.0 to i32\n";
   }

   public static void redefined_double(String id, String val, Boolean global) {
      buffer += "%"+id+" = sitofp i32 0 to double\n";
   }


   static void close_main() {
      main_text += buffer;
   }

   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }


}
