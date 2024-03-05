import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Test1.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку для поиска в файле:");
            String searchString = scanner.nextLine();

            String line;
            boolean found = false;

            File outputFile = new File("Search.txt");
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println("Найдено в файле: " + line);
                    bufferedWriter.write(line + "\n");
                    System.out.println("Записано в файл Search.txt: " + line);
                    found = true;
                }
            }
            if (!found) {
                System.err.println("Запрошенные данные не найдены");
            }
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
