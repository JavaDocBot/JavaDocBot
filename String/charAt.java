//Извлечение символов, демонстрация работы метода charAt

public class Main {
    public static void main(String[] args) {
        // демонстрация работы метода charAt()
        // для извлечения одного символа из строки, на него можно сослаться
        // напрямую по его индексу
        char ch;
        ch = "JAVA".charAt(2); // по индексу 2 расположен символ V
        System.out.println(ch); // вывод в терминал символа V

        // демонстрация работы метода getChars()
        // позволяет извлекать несколько символов по заданному диапазону
        // и помещает их в новый массив
        String s1 = "Строка для демонстрации работы метода `getChars().";
        int start = 11; // индекс старта извлечения (символ 'д')
        int end = 15; // индекс завершения извлечения (символ 'о')
        char[] buf1 = new char[end - start];
        s1.getChars(start, end, buf1, 0);
        // 0 задает точку отсчета нумерации индексов

        System.out.println("Полная строка с которой работает метод getChars, " +
                "указана ниже:\n" +
                "Строка для демонстрации работы метода `getChars().");
        System.out.println("Результат работы метода getChars(), извлечение " +
                "диапазона символов по идексу 11 - 15:");
        System.out.println(buf1);
        // вывод массива buf1 с диапазоном извлеченных символов

        // демонстрация работы метода toCharArray()
        // позволяет преобразовать все символы строки в массив
        // создаем массив buf2 и помещаем в него все символы строки s
        String s2 = "Строка для демонстрации работы метода `toCharArray().";
        char [] buf2 = s2.toCharArray();
        System.out.println("Создан массив buf2 со следующим содержимым:");
        System.out.println(buf2);
        // вывод массива buf2 с помещенными символами строки s
    }
}
