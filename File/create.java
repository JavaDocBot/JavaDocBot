// Демонстрация создания и переименования файла

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание файла Test.txt
            File file = new File("Test.txt");
            if (file.createNewFile()) {
                System.out.println("Файл Test.txt создан");
            } else {
                System.err.println("Файл Test.txt уже существует");
            }

            // Переименование файла Test.txt в Test1.txt
            File newFile = new File("Test1.txt");
            if (file.renameTo(newFile)) {
                System.out.println("Файл Test.txt переименован в Test1.txt");
            } else {
                System.err.println("Не удалось переименовать файл Test.txt");
            }
        } catch (IOException e) {
            System.err.println("Произошла ошибка ввода/вывода: " + e.getMessage());
        }
    }
}
