// Демонстрация переименования файла

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        boolean workInProgress1 = true;

        System.out.print("Введите имя файла для поиска: ");
        String fileName1 = scanner1.nextLine();
        File file = new File(fileName1);

        if (!file.exists() || !file.isFile()) {
            System.err.println("Файл не существует или не является файлом");
            return;
        }

        // Переименование файла
        Scanner scanner2 = new Scanner(System.in);
        boolean workInProgress2 = true;

        System.out.print("Введите новое имя файла для переименования: ");
        String fileName2 = scanner2.nextLine();
        File newFile = new File(fileName2);

        if (file.renameTo(newFile)) {
            System.out.println("Файл " + file + " переименован в " + newFile);

        } else {
            System.out.println("Не удалось переименовать файл" + file);
        }
    }
}
