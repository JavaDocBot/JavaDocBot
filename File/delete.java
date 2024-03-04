public class Main {
    public static void main(String[] args) {
            // Запрос на удаление файла Test1.txt
            File newFile = new File("Test1.txt");
            System.out.println("Желаете удалить файл Test1.txt? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                // Удаление файла Test1.txt
                if (newFile.exists()) {
                    if (newFile.delete()) {
                        System.out.println("Файл Test1.txt удалён");
                    } else {
                        System.err.println("Не удалось удалить файл Test1.txt");
                    }
                } else {
                    System.err.println("Файл Test1.txt не существует");
                }
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Файл Test1.txt сохранен");
            } else {
                System.err.println("Некорректный ввод, файл Test1.txt сохранен по умолчанию");
            }
        }
    }
