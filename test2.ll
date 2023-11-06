declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"
define i32 @main() nounwind{
%1 = add i32 1, 3
%2 = fptosi double 2.9 to i32
%3 = mul i32 %2, %1
%x = alloca i32
store i32 %3, i32* %x
%4 = sdiv i32 2, 6
%5 = sub i32 1, %4
%b = alloca i32
store i32 %5, i32* %b
%6 = sitofp i32 3 to double
%z = alloca double
store double %6, double* %z
%7 = load i32, i32* %x
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%9 = load double, double* %z
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %9)
%k = alloca i32
%11 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %k)
%l = alloca double
%12 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %l)
ret i32 0 }

