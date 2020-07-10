import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static final char DOT_EMPTY = '•'; // символ отвечающий за свободную клетку
    public static char[][] field; // создали двумерный массив
    public static final int SIZE = 3; //размер поля
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner playerMoveScanner = new Scanner(System.in);
    public static Random randomMoveComputer = new Random();

    public static void main(String[] args) {
        initField();
        outputField();
        while (true) {
            playerMove();
            outputField();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            moveComputer();
            outputField();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initField() {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void outputField() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (field[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


    public static void playerMove() {
        int x, y;
        do {
            System.out.println("Введите значения от 1 до 3 в формате Х У");
            x = playerMoveScanner.nextInt() - 1;
            y = playerMoveScanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[x][y] = DOT_X;
    }

    public static void moveComputer() {
        int x, y;
        do {
            x = randomMoveComputer.nextInt(SIZE);
            y = randomMoveComputer.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер выбрал точку Х: " + (x + 1) + " Y: " + (y + 1));
        field[x][y] = DOT_O;
    }

    public static boolean checkWin0(char symb) {
        if(field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
        if(field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
        if(field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;
        if(field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
        if(field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
        if(field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;
        if(field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
        if(field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }
}
