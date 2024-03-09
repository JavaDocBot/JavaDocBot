//Демонстрация работы оператора перехода (return)

public class Main {
    public static void main(String[] args) {
        // вызываем метод daytime и передаем переменной hour
        // соответствующие значение времени суток (6, 13, 18, 3, 25)
        // выводим результат в терминал
        System.out.println("\nВремя суток, в зависимости от часа:");
        System.out.println(daytime(6));
        System.out.println(daytime(13));
        System.out.println(daytime(18));
        System.out.println(daytime(3));
        System.out.println(daytime(25));
    }

    // метод daytime для демонстрации работы оператора return
    static String daytime(int hour) {
        if (hour >= 5 & hour <= 11) // 6
            return hour + " часов - " + "Время суток - Утро";
        else if (hour >= 12 & hour <= 16) // 13
            return hour + " часов - " + "Время суток - День";
        else if (hour >= 17 & hour <= 24) // 18
            return hour + " часов - " + "Время суток - Вечер";
        else if (hour >= 0 & hour <= 4) // 3
            return hour + " часа - " + "Время суток - Ночь";
        else
            return hour + " часов - " + "Неверное время"; // 25
    }
}
