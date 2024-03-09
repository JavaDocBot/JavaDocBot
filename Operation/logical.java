//Демонстрация логических операций

public class Main {
    public static void main(String[] args) {
        // объявление переменных и присваивание первичных значений
        boolean a = true;
        boolean b = false;
        // логические операции
        boolean c = a | b; // true
        boolean d = a & b; // false
        boolean e = a ^ b; // true
        boolean f = (!a & b) | (a & !b); // true
        boolean g = !a; // false
        // вывод в терминал текстового комментария и результатов логических операций
        System.out.println("Логические операции:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a | b: " + c);
        System.out.println("a & b: " + d);
        System.out.println("a ^ b: " + e);
        System.out.println("!a & b | a & !b: " + f);
        System.out.println("!a: " + g);
        System.out.println("Условные 'И' и 'ИЛИ':");
        int x = 0;
        int y = 100;
        if (x != 0 && y / x > 10) {
            System.out.println("x != 0, операция выполняется:");
        } else {
            System.out.println("Значение x = 0. При применении условного И (&&) операция не приведет"
                    + " к исключению, при значении x = 0,\nтак как не будет выполняться правый"
                    + " операнд, (деление на 0=) и программа продолжит работу.");
        }
    }
}
