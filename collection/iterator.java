//Демонстрация работы итератора (iterator)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("BMW");

        System.out.println("Содержание коллекции Cars:");
        Iterator<String> iterator1 = cars.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + ";");
        }

        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("+79211234567");
        phoneNumbers.add("+79111234567");
        phoneNumbers.add("+79212345678");
        phoneNumbers.add("+79112345678");

        System.out.println("\n\nСодержание коллекции phoneNumbers:");
        Iterator<String> iterator2 = phoneNumbers.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + ";");
        }
    }
}
