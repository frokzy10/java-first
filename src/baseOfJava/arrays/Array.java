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
    }
}
