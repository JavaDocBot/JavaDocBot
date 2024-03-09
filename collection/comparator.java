// Демонстрация работы компаратора (comparator)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 35));

        // состав коллекции до сортировки
        System.out.println("Список до сортировки:");
        System.out.println(persons);

        // сортировка по имени
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Collections.sort(persons, nameComparator);
        System.out.println("\nСортировка по имени:");
        System.out.println(persons);

        // сортировка по возрасту
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Collections.sort(persons, ageComparator);
        System.out.println("\nСортировка по возрасту:");
        System.out.println(persons);
    }
}
class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }

    // переопределяем в классе метод toString() для вывода строкового представления из коллекции
    @Override
    public String toString() {
        return name + " " + age;
    }
}
