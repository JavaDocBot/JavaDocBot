// Демонстрация составных операций присваивания

public class Main {
    public static void main(String[] args) {
        // объявление переменных и присваивание первичных значений
        int a = 4;
        int b = 6;
        int c = 42;
        double d = 3.0;
        double e = 42.25;
        System.out.println("Операции инкремента и декремента:");
        // операции инкремента и декремента
        a++; // 5
        b--; // 5
        // вывод в терминал текстового комментария и значений переменных a, b
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
        System.out.println("\nСоставные операции присваивания:");
        // составные операции присваивания
        a += 4; // 9
        b *= 2; // 10
        c %= 20; // 2
        d /= 2; // 1.5
        e %= 10; // 2.25
        // вывод в терминал текстового комментария и значений переменных a, b, c, d, e
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
        System.out.println("Значение c: " + c);
        System.out.println("Значение d: " + d);
        System.out.println("Значение e: " + e);
    }
}
