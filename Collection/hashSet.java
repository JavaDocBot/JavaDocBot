// Демонстрация работы HashSet
import java.util.*;

public class Main {
    public static void main(String [] args) {
        // Создать хеш-таблицу
        HashSet<String> hs = new HashSet<>();

        // Добавить элементы в хеш-таблицу
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("Содержимое хеш - таблицы hs:");
        System.out.println(hs);
    }
}
