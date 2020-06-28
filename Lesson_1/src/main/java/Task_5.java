public class Task_5 {
    public static void main(String[] args) {

        if (positive_or_negative_number(5L) == true) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean positive_or_negative_number (long a) {

        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }

}
