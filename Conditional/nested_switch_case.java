// Демонстрация работы условной конструкции с вложенным оператором (switch - case)

public class Main {
    public static void main(String[] args) {
        // объявляем переменные count и target типа int и присваиваем им значения
        int count = 2;
        int target = 1;
        // проверяем совпадение значений переменных с использованием внешнего и вложенного операторов switch ..case
        // и выводим в терминал текстовое сообщение соответствующего совпавшего case
        switch (count) {
            case 1:
                switch (target) { // вложенный switch
                    case 1:
                        System.out.println("Вы выбрали вариант 1.1.");
                        break;
                    case 2:
                        System.out.println("Вы выбрали вариант 1.2.");
                        break;
                }
                break;
            case 2:
                switch (target) { // вложенный switch
                    case 1:
                        // нет конфликтов с case 1 внешнего switch
                        System.out.println("Вы выбрали вариант 2.1.");
                        break;
                    case 2:
                        System.out.println("Вы выбрали вариант 2.2.");
                        break;
                }
                break;
            default:
                System.out.println("неверное значение выбора (count)");
                break;
        }
    }
}
