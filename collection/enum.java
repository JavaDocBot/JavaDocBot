// Демонстрация работы перечислений (enum)

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Main {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
            case TUESDAY:
                System.out.println("Today is Tuesday");
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
            case THURSDAY:
                System.out.println("Today is Thursday");
            case FRIDAY:
                System.out.println("Today is Friday");
            case SATURDAY:
                System.out.println("Today is Saturday");
            case SUNDAY:
                System.out.println("Today is Sunday");
        }
    }
}
