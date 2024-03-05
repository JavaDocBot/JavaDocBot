import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("Test.txt"); // Создаем объект File
        // Проверяем существование файла
        if (file.exists()) {
            FileInputStream fis = null;
            // Открываем файл с помощью FileInputStream
            try {
                fis = new FileInputStream(file); // Открываем файл с помощью FileInputStream
                int data;
                // Читаем файл
                while ((data = fis.read()) != -1) {
                    // Выводим содержимое в терминал
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
                // Закрываем файл в блоке finally
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        } else {
            System.err.println("Файл не существует");
        }
    }
}
