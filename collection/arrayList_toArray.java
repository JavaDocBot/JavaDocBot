// Преобразование ArrayList в массив
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Создать список
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Добавить элементы в список
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Содержимое массива al: " + al);

        // Преобразовать список в массив
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        // Суммировать элементы массива
        for(int i : ia) sum += i;

        System.out.println("Сумма элементов массива ia: " + sum);
    }
}
