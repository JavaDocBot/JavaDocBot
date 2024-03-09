// Демонстрация операций отношения

class Main {
    public static void main(String[] args) {
        // объявление переменных и присваивание первичных значений
        int a = 2;
        int b = 4;
        double c = 8.0;
        double d = 10.0;
        char e = 'X';
        char f = 'Y';
        boolean g = false;
        boolean h = true;
        // операции отношения
        boolean z1 = a != b; // true
        boolean z2 = a > b; // false
        boolean z3 = c < d; // true
        boolean z4 = d >= c; // true
        boolean z5 = e == f; // false
        boolean z6 = e != f; // true
        boolean z7 = g == true; // false
        boolean z8 = g != h; // true
        // вывод в терминал текстового комментария и результатов операций отношения
        System.out.println("Операции отношения:");
        System.out.println("a != b: " + z1);
        System.out.println("a > b: " + z2);
        System.out.println("c < d: " + z3);
        System.out.println("d >= c: " + z4);
        System.out.println("e == f: " + z5);
        System.out.println("e != f: " + z6);
        System.out.println("g == true: " + z7);
        System.out.println("g != f: " + z8);
    }
}
