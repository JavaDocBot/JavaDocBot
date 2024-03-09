// Демонстрация работы условной конструкции (if - else)

public class Main {
    public static void main(String[] args) {
        // объявляем переменную month типа int и присваиваем ей значение 4 (порядковый номер месяца апреля)
        int month = 4; // апрель
        // объявляем переменную season типа string
        String season;
        // проверяем условие с использованием операторов if-else-if
        // и присваиваем переменной season соответствующее значение
        if (month == 12 || month == 1 || month == 2)
            season = "зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "осень";
        else
            season = "несуществующий месяц";
        // вывод в терминал текстового комментария и значения переменной season
        System.out.println("Апрель -  это " + season + ".");
    }
}
