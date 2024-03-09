// Демонстрация создания строк

public class Main{
    public static void main(String[] args)  {

        //Создать объект String из другого объекта String.
        char[] c = {'J', 'a', 'v', 'a'};
        // создаем объект типа String s1 из массива с
        String s1 = new String(c);
        // создаем объект типа String s2 из объекта s1
        String s2 = new String(s1);
        // вывод в терминал s1 и s2
        System.out.println(s1);
        System.out.println(s2);

        //Создание строки из поддиапазона массива байтов.
        byte[] ascii = {65, 66, 67, 68, 69, 70};
        // создаем объект типа String s3 из массива байтов ascii (коды символов)
        String s3 = new String(ascii);
        // создаем объект типа String s4 из поддиапазона массива байтов
        String s4 = new String(ascii, 2, 3); //с индекса 2, длиной 3
        // вывод в терминал s1 и s2
        System.out.println(s3);
        System.out.println(s4);
    }
}
