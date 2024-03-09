//Демонстрация работы оператора перехода (continue)

public class Main {
    public static void main(String[] args) {
        // объявляем внутренний цикл с условием
        System.out.println("\nРабота оператора continue c условием:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  ");
            if (i % 2 == 0) // если число четное
                continue; // цикл продолжается, если число нечетное
            // исполняется этот оператор и выполняет вывод на экран пометки 'нечетное' и
            // перевод строки на новую
            System.out.println("- нечетное");
        }
        System.out.println("\nРабота оператора continue c условием и меткой " +
                "перехода label:\n");
        // объявляем внешний цикл с меткой
        label: for (int i = 1; i < 10; i++) {
            // объявляем внутренний цикл с условием
            for (int j = 1; j < 10; j++) {
                if (j > i) { // если j > i завершается цикл по j (внутренний) и продолжается по i (внешний)
                    System.out.println(); // и выполняется перевод строки на новую
                    continue label; // оператор continue и метка label переход на внешний цикл
                }
                System.out.print(" " + (i * j)); // оператор исполняется пока j < i
            }
        }
        System.out.println();
    }
}
