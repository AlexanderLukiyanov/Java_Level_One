public class Task_8 {
    public static void main(String[] args) {

        leapyear(2020);

    }

    public  static void leapyear(int a) {

        if (a % 400 == 0) {
            System.out.println("Год високосный.");
        } else if (a % 100 == 0) {
            System.out.println("Год не високосный.");
        } else if (a % 4 == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }

}
