package lesson2;

public class Conditions {
    public static void main(String[] args) {
        int minute = 60;

        if (minute >= 0 && minute < 15) {
            System.out.println("Первая четверть");
        } else if (minute >= 15 && minute < 30) {
            System.out.println("Вторая четверть");
        } else if (minute >= 30 && minute < 45) {
            System.out.println("Третья четверть");
        } else if (minute >= 45 && minute < 60) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("Данное число не попадает ни в одну четверть");
        }
    }
}
