// Демонстрация сравнения строк, методом equals

public class Main {
    public static void main(String[] args) {

        //демонстрация работы методов equals() и equalsignoreCase().
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println("Сравнение строк " + s1 + " и " + s2 +
                " с помощью equals() -> " + s1.equals(s2)); //true

        System.out.println("Сравнение строк " + s1 + " и " + s3 +
                " с помощью equals() -> " + s1.equals(s3)); // false

        System.out.println("Сравнение строк " + s1 + " и " + s4 +
                " с помощью equals() -> " + s1.equals(s4)); // false
        // сравнение с игнорированием различий в регистре
        System.out.println("Сравнение строк " + s1 + " и " + s4 +
                " с помощью equalsIgnoreCase() -> "
                + s1.equalsIgnoreCase(s4)); // true

        // метод `equals()` и операция == выполняют два разных действия
        // пример ниже демонстрирует разный результат сравнения
        String s5 = "Привет!";
        String s6 = new String(s5);
        System.out.println("Сравнение строк " + s5 + " и " + s6 +
                " с помощью equals() -> " + s5.equals(s6)); // true
        System.out.println("Сравнение строк " + s5 + " и " + s6 +
                " c помощью == -> " + (s5 == s6)); // false
    }
}
