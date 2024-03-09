// Демонстрация преобразования в строку, с использованием метода toString

public class Main {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Коробка b: " + b; //конкатенция с объектом Box

        System.out.println(b); //преобразование Box в строку и вывод в терминал
        System.out.println(s); // вывод в терминал объекта String s
    }
}
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // возврат объекта `String`, содержащий удобочитаемую строку, которая надлежащим
    // образом описывает объект Box вашего класса Box
    public String toString() {
        return "Размеры коробки: " + width + " на "
                + depth + " на " + height + ". ";
    }
}
