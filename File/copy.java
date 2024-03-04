import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Проверка наличия файла Test.txt
        File sourceFile = new File("Test.txt");
        if (!sourceFile.exists()) {
            System.err.println("Файл Test.txt не существует");
            return;
        }
        // Открытие файла Test.txt
        try (FileReader reader = new FileReader(sourceFile)) {
            // Создание файла Test1.txt
            File destFile = new File("Test1.txt");
            if (destFile.createNewFile()) {
                System.out.println("Файл Test1.txt создан");

                // Копирование данных из Test.txt в Test1.txt
                try (FileWriter writer = new FileWriter(destFile)) {
                    int character;
                    while ((character = reader.read()) != -1) {
                        writer.write(character);
                    }
                    System.out.println("Содержимое файла Test.txt успешно скопировано в файл Test1.txt");
                } catch (IOException e) {
                    System.err.println("Ошибка при копировании данных: " + e.getMessage());
                }
            } else { // Если файл Test1.txt  уже существует, будет выдано исключение
                System.err.println("Файл Test1.txt уже существует");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла Test.txt: " + e.getMessage());
        }
    }
}
