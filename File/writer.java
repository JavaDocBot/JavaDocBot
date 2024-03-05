import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("Test1.txt");

        try (FileWriter writer = new FileWriter(newFile, true)) {
            // Запрос данных у пользователя через Scanner
            System.out.println("Введите данные для записи в файл Test1.txt " +
                    "(для завершения введите 'конец'):");
            Scanner scanner = new Scanner(System.in);
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("конец")) {
                writer.write(input + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи данных в файл Test1.txt: "
                    + e.getMessage());
        }
    }
}
