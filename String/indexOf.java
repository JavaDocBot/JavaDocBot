// Поиск в строках, демонстрация работы indexOf и lastIndexOf

class Main {
    public static void main(String[] args) {
        String s = "Now is the time for all good men "
                + "to come to the aid of their country.";
        System.out.println(s);
        // первое вхождение t, индекс 7
        System.out.println("infexOf(t) = " + s.indexOf('t'));
        // последнее вхождение t, индекс 65
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        // первое вхождение the, индекс 7
        System.out.println("indexOf(the) = " + s.indexOf("the"));
        // последнее вхождение the индекс 55
        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        // первое вхождение t от индекса 10, на индексе 11
        System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
        //последнее вхождение t от индекса 60, на индексе 55
        System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf('t', 60));
        // первое вхождение the от индекса 10, на индексе 44
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        // последнее вхождение the от индекса 60, на индексе 55
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));
    }
}
