// Демонстрация использования тернарных операций

public class Main {
    public static void main(String[] args) {
        // объявление переменных и присваивание первичных значений
        int x, y;
        x = 10;
        y = x < 0 ? (x * 2) : (x / 2); // первая тернарная операция

        // вывод в терминал текстового комментария и результата первой тернарной
        // операции
        System.out.println("Тернарные операции:");
        System.out.println("Результат первой тернарной операции (x = 10) x < 0 ? (х * 2) : (х / 2): " + y);

        x = -10;
        y = x < 0 ? (y * 2) : (y / 2); // вторая тернарная операция
        // вывод в терминал текстового комментария и результата второй тернарной
        // операции
        System.out.println("Результат второй тернарной операции (x = -10) x < 0 ? (х * 2) : (х / 2): " + y);
    }
}
