public class Task_4 {
    public static void main(String[] args) {

        System.out.println(summ_10_20(5.5f,5.5f));

    }

    public static boolean summ_10_20 (float a, float b) {

        float k = a + b;

        if (k >= 10 & k <= 20) {
            return true;
        } else {
            return false;
        }

    }

}
