// Демонстрация сравнения областей строк с применением метода regionMatches

import java.io.*;

public class Main {
public static void main(String args[]) {
    String Str1 = new String("Добро пожаловать в Java");
    String Str2 = new String("Java");
    String Str3 = new String("JAVA");
    // проверяет, совпадает ли область объекта Str2 c областью объекта Str1, с учетом регистра
    System.out.print("Возвращаемое значение: ");
    System.out.println(Str1.regionMatches(19, Str2, 0, 4));
    // проверяет, совпадает ли область объекта Str3 c областью объекта Str1, с учетом регистра
    System.out.print("Возвращаемое значение: ");
    System.out.println(Str1.regionMatches(19, Str3, 0, 4));
    // проверяет, совпадает ли область объекта Str3 c областью объекта Str1, без учета регистра
    System.out.print("Возвращаемое значение: ");
    System.out.println(Str1.regionMatches(true, 19, Str3, 0, 4));

    // метод `startWith()` определяет, начинается ли объект `String` с указанной строки,
    // а метод `endsWith()` выясняет, заканчивается ли объект `String` заданной строкой

    // проверяет, начинается ли объект Str1 заданной строкой "Добро пожаловать"
    System.out.print("\nВозвращаемое значение: " );
    System.out.println(Str1.startsWith("Добро пожаловать"));
    // проверяет, заканчивается ли объект Str1 заданной строкой "пожаловать"
    System.out.print("Возвращаемое значение: " );
    System.out.println(Str1.endsWith("пожаловать"));
    // проверяет, заканчивается ли объект Str1 заданной строкой "Java"
    System.out.print("Возвращаемое значение: " );
    System.out.println(Str1.endsWith("Java"));
    }
}
