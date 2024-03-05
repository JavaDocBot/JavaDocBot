import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Чтение данных из файла Test1.txt и вывод в консоль
        File newFile = new File("Test1.txt");
        try (FileReader reader = new FileReader(newFile)) {
            int character;
            System.out.println("Содержимое файла Test1.txt:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении данных из файла Test1.txt: "
                    + e.getMessage());
        }
    }
}
