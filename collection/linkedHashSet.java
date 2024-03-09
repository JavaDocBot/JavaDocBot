// Демонстрация работы LinkedHashSet
import java.util.*;

public class Main {
    public static void main(String [] args) {
        // Создать хеш-таблицу
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Добавить элементы в хеш-таблицу
        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");

        System.out.println("Содержимое хеш - таблицы lhs, вывод в порядке добавления в таблицу:");
        System.out.println(lhs);
    }
}
