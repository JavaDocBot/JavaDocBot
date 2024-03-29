//Демонстрация работы цикла (for)

public class Main {
    public static void main(String[] args) {
        System.out.println("\nОбработка циклом for целых чисел:");
        // объявляем переменные a и b, видимые втч за пределами цикла
        int a, b;
        // объявляем цикл и указываем в теле цикла операторы вывода полученных значений в
        // терминал
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("Значение переменной a: " + a);
            System.out.println("Значение переменной b: " + b);
        }

        System.out.println("\nОбработка циклом for вещественных чисел:");
        // объявляем переменные c и d, видимые втч за пределами цикла
        double c, d;
        // объявляем цикл и указываем в теле цикла операторы вывода полученных значений в
        // терминал
        for (c = 2.0, d = 4.0; c < d; c += 0.5, d -= 0.5) {
            System.out.println("Значение переменной c: " + c);
            System.out.println("Значение переменной d: " + d);
        }
        System.out.println("\nОбработка циклом for массива символов:");
        // объявляем массив с типом данных char и присваиванием им значения
        char[] array = { 'I', 'L', 'i', 'k', 'e', 'J', 'a', 'v', 'a', '!' };
        // выполняем перебор массива циклом for и вывод в терминал текстового
        // комментария и значений элементов массива
        for (int i = 0; i < 10; i++) { // переменная i объявлена внутри цикла for
            System.out.print(array[i] + "  ");
        }
        System.out.println("\n");
    }
}
