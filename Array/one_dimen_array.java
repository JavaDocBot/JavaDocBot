// Демонстрация работы с одномерными массивами

public class Main {
    public static void main(String[] args) {
        // объявляем массив с типом данных int из 12 элементов и присваиванием им
        // значения
        int[] month_days = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };
        // вывод в терминал текстового комментария и значения пятого элемента массива с
        // индексом [4]
        System.out.println("В мае: " + month_days[4] + " день.");

        // объявляем массив с типом данных double из 6 элементов и присваиванием им
        // значения
        double[] kettlebell_weight = { 1.5, 2.5, 3.5,
                4.5, 5.5, 6.5 };
        // вывод в терминал текстового комментария и значения третьего элемента массива
        // с индексом [2]
        System.out.println("Вес гири № 3: " + kettlebell_weight[2] + " кг.");

        // объявляем массив с типом данных char из 4 элементов и присваиванием им
        // значения
        char[] array_char = { 'J', 'A', 'V', 'A' };
        // вывод в терминал текстового комментария и значений массива
        System.out.println( "Я изучаю язык программирования: "
                + array_char[0] + array_char[1] + array_char[2] + array_char[3]);
    }
}
