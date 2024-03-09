//Демонстрация работы условной конструкции (switch - case)

public class Main {
    public static void main(String[] args) {
        // объявляем переменную month типа int и присваиваем ей значение 10 (порядковый номер месяца октября)
        int month = 10; // октябрь
        // объявляем переменную season типа string
        String season;
        // проверяем условие с использованием операторов switch .. case и присваиваем
        // переменной season соответствующее значение
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "несуществующий месяц";
        }
        // вывод в терминал текстового комментария и значения переменной season
        System.out.println("Октябрь -  это " + season + ".");
    }
}
