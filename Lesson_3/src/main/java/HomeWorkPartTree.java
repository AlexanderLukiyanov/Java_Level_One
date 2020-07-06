import java.util.Random;
import java.util.Scanner;

public class HomeWorkPartTree {
    public static void TaskOne() {
        for ( int k = 1; k >= 1 && k <= 1;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Угадайте число от 0 до 9.");

            Random random = new Random();
            int RandomNumber = random.nextInt(10);

            for (int i = 1; i <= 3; i++) {
                System.out.println("Попытка № " + i);
                int UserNumber = sc.nextInt();

                if (UserNumber == RandomNumber) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (UserNumber > RandomNumber) {
                    System.out.println("Вы не угадали! Загаданное число меньше.");
                } else if (UserNumber < RandomNumber) {
                    System.out.println("Вы не угадали! Загаданное число больше.");
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Повторить игру еще раз? 1 - Да / 0 - Нет");
            int Replay = scanner.nextInt();
            k = Replay;
        }
    }


    public static void TaskTwo() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int ExitGameVariable = 0;
        while (ExitGameVariable == 0) {
            System.out.println("Угадайте слово");

            Random randomNumber = new Random();
            int randomNumberString = randomNumber.nextInt(24);

            Scanner UserStringScanner = new Scanner(System.in);

            int RemoveGameVariable = 1;
            while (RemoveGameVariable == 1) {
                String UserString = UserStringScanner.nextLine();
                for (int i = 0; i < words.length; i++) {
                    if (i == randomNumberString) {
                        if (UserString.equals(words[i])) {
                            System.out.println("Вы угадали слово");
                            continue;
                        } else {
                            for (int j = 0; j <= words[i].length(); j++) {
                                int sameHodden = words[i].charAt(j);
                                int sameGuessed = UserString.charAt(j);
                                if (sameHodden == sameGuessed) {
                                    System.out.print((char) sameHodden);
                                } else {
                                    System.out.println("###############");
                                    break;
                                }
                            }
                        }
                    }
                }
                Scanner RemoveGameScanner = new Scanner(System.in);
                System.out.println("Продолжить игру? 1 - Да, 0 - Нет");
                int RemoveGame = RemoveGameScanner.nextInt();
                if (RemoveGame == 1) {
                    RemoveGameVariable = 1;
                } else {
                    RemoveGameVariable = 0;
                    Scanner ExitGameScanner = new Scanner(System.in);
                    System.out.println("Выйти из игры? 1 - Да, 0 - Нет");
                    int ExitGame = ExitGameScanner.nextInt();
                    if (ExitGame == 1) {
                        ExitGameVariable = 1;
                        System.out.println("Игра окончена. Спасибо!");
                    } else {
                        ExitGameVariable = 0;
                    }
                }
            }
        }
    }
}
