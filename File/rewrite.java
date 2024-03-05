import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean workInProgress = true;

        System.out.print("Введите имя файла для поиска: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) {
            System.err.println("Файл не существует или не является файлом");
            return;
        }

        while (workInProgress) {
            System.out.print("Введите данные для поиска: ");
            String searchData = scanner.nextLine();

            StringBuilder fileContent = new StringBuilder();
            boolean matchFound = false;
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.contains(searchData)) {
                        matchFound = true;
                        System.out.println("Совпадение найдено: " + line);
                        System.out.print("Хотите изменить эту строку? (yes/no): ");
                        String choice = scanner.nextLine();
                        if (choice.equalsIgnoreCase("yes")) {
                            System.out.print("Введите новые данные: ");
                            String newData = scanner.nextLine();
                            line = newData; // перезаписываем строку с новыми данными
                        }
                    }
                    fileContent.append(line).append("\n");
                }
                if (!matchFound) {
                    System.out.println("Совпадений не найдено.");
                }
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
            }

            // Записываем новые данные
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(fileContent.toString());
                System.out.println("Данные успешно обновлены в файле.");

                System.out.print("Хотите продолжить поиск? (yes/no): ");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("no")) {
                    workInProgress = false;
                }
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}
