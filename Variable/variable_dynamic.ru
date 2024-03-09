// Демонстрация динамической инициализации переменной,
// на примере вычисления значения гипотензы треугольника

class Main {
    public static void main(String[] args) {
        // объявляем переменные a и b типа double и присваиваем им значения - константы
        double a = 3.0, b = 4.0;
        // динамически инициализируем переменную c в результате выполнения операции (вычисления гипотенузы)
        double с = Math.sqrt (a * a + b * b);
        // вывод в терминал текстового комментария и значений a, b, c
        System.out.println("Значения катетов треугольника: " + a + ", " + b);
        System.out.println("Длина гипотенузы треугольника: " + с);
    }
}
