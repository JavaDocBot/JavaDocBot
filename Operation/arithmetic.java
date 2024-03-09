// В следующем примере показаны арифметические операции:

public class Main {
    public static void main(String[] args) {
        // арифметические операции со значениями int
        System.out.println("Целочисленная арифметика:");
        int a = 1 + 1; // a = 2
        int b = a * 3; // b = 6
        int c = b / 4; // c = 1
        int d = c - a; // d = -1
        int e = -d; // e = 1
        // вывод в терминал текстового комментария и значений переменных a, b, c, d, e
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
        System.out.println("Значение c: " + c);
        System.out.println("Значение d: " + d);
        System.out.println("Значение e: " + e);
        // арифметические операции со значениями double
        System.out.println("\nАрифметика с плавающей точкой:");
        double da = 1.0 + 1.0; // 2.0
        double db = da * 3.0; // 6.0
        double dc = db / 4.0; // 1.5
        double dd = dc - a; // -0.5
        double de = -dd; // 0.5
        // вывод в терминал текстового комментария и значений переменных da, db, dc, dd, de
        System.out.println("Значение da: " + da);
        System.out.println("Значение db: " + db);
        System.out.println("Значение dc: " + dc);
        System.out.println("Значение dd: " + dd);
        System.out.println("Значение de: " + de);
    }
}
