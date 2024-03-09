//Демонстрация конкатенации строк

public class Main {
    public static void main(String[] args) {
        // использование конкатенации с объектами String
        String age1 = "9";
        String s1 = "Игорю " + age1 + " лет.";
        System.out.println(s1);

        // использование конкатенации с объектами String и int
        int age2 = 5;
        String s2 = "Сергею " + age2 + " лет.";
        String s3 = "Через год Сергею будет " + (age2 + 1) + " лет.";

        // в случае ниже вывод будет отличаться от ожидаемого, будет - 51 вместо 6,
        // пропущенны скобки, будет выполнена конкатенация и не будет выполнена операция сложения
        String s4 = "Через год Сергею будет " + age2 + 1 + " лет.";
        System.out.println(s2 + "\n"+ s3 + "\n" + s4);

        // использование конкатенации с объектами String и float
        float val1 = 1000.56f;
        float val2 = 530.32f;
        String s5 = "Остаток средств на счете, после частичного снятия "
                + (val1 - val2) + " долларов.";
        System.out.println(s5);

        //использование конкатенации для избавления от длинных строк.
        String longStr = "Такую очень длинную строку " +
                "пришлось бы разносить по нескольким " +
                "экранным строчкам.\nНо конкатенация " +
                "позволяет предотвратить это.";
        System.out.println(longStr);
            }
        }
