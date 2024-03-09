// Демонстрация использования TreeSet.
import java.util.*;

class Main {
    public static void main(String args[]) {
        // Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<String>();

        // Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println("Содержимое древовидного набора ts:");
        System.out.println(ts);
        System.out.println("Содержание фрагмента древовидного набора ts,\nс " +
                "использованием интерфейса NavigableSet (метод subSet)");
        System.out.println(ts.subSet ("C", "F"));
        System.out.println("Количество элементов в древовидном наборе ts:");
        System.out.println(ts.size());
    }
}
