// Демонстрация добавления данных в файл

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Test1.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл Test1.txt создан");
            } else {
                System.err.println("Файл Test1.txt уже существует");
            }

            // Открываем файл для добавления данных
            try (FileWriter writer = new FileWriter(file, true)) {
                // Запрашиваем ввод данных у пользователя через терминал Scanner
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите данные для записи в файл " +
                        "(для завершения введите 'exit'):");

                while (true) {
                    String input = scanner.nextLine();
                    if (input.equals("exit")) {
                        break;
                    }
                    writer.write(input + "\n");
                }
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }

            // Снова открываем файл для добавления данных
            try (FileWriter writer = new FileWriter(file, true)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите данные для добавления в файл " +
                        "(для завершения введите 'exit'):");

                while (true) {
                    String input = scanner.nextLine();
                    if (input.equals("exit")) {
                        break;
                    }
                    writer.write(input + "\n");
                }
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода/вывода: " + e.getMessage());
        }
    }
}
