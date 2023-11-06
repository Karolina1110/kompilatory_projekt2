Obsługa wejścia wyjścia:

print ID - drukuje na konsoli wartość podanej zmiennej

Przykład 1:
a = 2
print a

read type ID - zczytuje z konsoli podaną wartość i zapisuje ją pod podaną zmienną, należy podać typ czytanej wartości

Przykład 1:
read int x

Przykład 2:
read real y

Obsługa ciągu znaków:

Zmienne podane w cudzysłowiu "..." są traktowane jako typ string, ciąg znaków

Przykład 1:
a = "Hello" 

Funkcje:

Istnieje możliwość tworzenia funkcji o danej nazwie, funkcja zwraca wartość o podanym wcześniej typie,
 konieczne jest zwrócenie wartości, nie można mieszać nazw funkcji z nazwami zmiennych, 
 strukturę funkcji przedstawiono poniżej:

function type ID
...
i = ...
return i
end

Przykład 1:
function int v
k = 1
print k
l = k + 1
return l
end

Dynamiczne typowanie:

Istnieje możliwość przypisania wartości int do zmiennej zadeklarowanej wcześniej jako real i na odwrót. 
Ponadto w działaniach matematycznych przy występowaniu zmiennych typu int i real następuje automatyczne rzutowanie na tym real i takie też wyjście jest otrzymywane. 
Nie należy zmieniać typu zmiennej wcześniej zadeklarowanej jako element tablicy lub string.

Przykład 1:
x = 1 
x = 3.5

Przykład 2:
a = 1
b = 2.4
c = a + b



