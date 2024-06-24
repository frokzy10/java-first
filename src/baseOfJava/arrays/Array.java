package baseOfJava.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] seasons = {"Winter", "Spring"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        int[] numbers = {3, 5, 6, 4, 2, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//        Многомерные массивы
        int[][] array = new int[3][3];
        array[1][2] = 10;
        array[0][0] = 20;

        int[][] secondArray = new int[][]{{1, 2}, {3, 4}};
        System.out.println(secondArray[0][0]);

        String[][] stringArray = new String[][]{{"Нурдин", "Дуулат"}, {"Бекхан", "Данияр"}};
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                System.out.println(stringArray[i][j]);
            }
        }
    }
}