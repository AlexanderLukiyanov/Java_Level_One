public class HomeWorkPartTwo {
    public static void replacementOfZerosAndOnes(String[] args) {

        int[] arrayZerosAndOnes = new int[10];
        arrayZerosAndOnes[0] = 1;
        arrayZerosAndOnes[1] = 1;
        arrayZerosAndOnes[2] = 0;
        arrayZerosAndOnes[3] = 0;
        arrayZerosAndOnes[4] = 1;
        arrayZerosAndOnes[5] = 0;
        arrayZerosAndOnes[6] = 1;
        arrayZerosAndOnes[7] = 0;
        arrayZerosAndOnes[8] = 0;
        arrayZerosAndOnes[9] = 1;

        for (int counter = 0; counter < 10; counter++) {
            if (arrayZerosAndOnes [counter] == 1) {
            arrayZerosAndOnes [counter] = 0;
            } else {
                arrayZerosAndOnes [counter] = 1;
            }
        }
    }

    public static void loopFilling() {
        int [] arrayEmpty = new int[8];
        int i = 0;
        for (int counter = 0; counter <= 21; counter = counter + 3) {
            arrayEmpty [i] = counter;
            i++;
        }
    }

    public static void MoreThanSix() {
        int [] arrayMoreThanSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i :arrayMoreThanSix) {
            if (i < 6) {
                i = i * 2;
            }
            System.out.println(i);
        }
    }

    public static void diagonalReplacement() {
            int [][] twoDimensionalArray = new int[5][5];
            int counter = 0;
            int k = 1;
            for (int i = 0; i < twoDimensionalArray.length; i++) {
                for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                    if (k == 1 || k == 5 || k == 7 || k == 9 || k == 13 || k == 17 || k == 19 || k == 21 || k == 25) {
                        counter = 1;
                    } else {
                        counter = 0;
                    }
                    k++;
                    twoDimensionalArray[i][j] = counter;
                }
            }
        }

    public static void findingMaxMin() {
        int[] arrayMaxMin = {4, 2, 8, 10, 12, 5};
        int maxValue = arrayMaxMin[0];
        int minValue = arrayMaxMin[0];
        for (int i = 0; i < arrayMaxMin.length; i++) {

            if(minValue > arrayMaxMin[i]) {
                minValue = arrayMaxMin[i];
            }

            if (maxValue < arrayMaxMin[i]) {
                maxValue = arrayMaxMin[i];
            }
        }
    }
    public static boolean SearchCenterArray(int [] CenterArray) {
        int l = 0;
        int k = 0;
        int a = 1;

            for (int j : CenterArray) {
                k = k + j;
                System.out.println(k);
            }

            if (a == 1) {
                for (int i = 0; i < CenterArray.length; i++) {
                if (k / (CenterArray[i] + l) == 2) {
                    a = 0;
                } else {
                    l = CenterArray[i];
                    a = 2;
                }
            }
        }
            if (a == 0) {
                return true;
            } else {
                return false;
            }
    }
    }