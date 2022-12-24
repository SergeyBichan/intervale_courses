package ru.intervale.courses.task1;

import java.util.Arrays;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] arr2 = new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        int[] emptyArray = new int[]{};

        System.out.println(Arrays.toString(numOfPositiveAndSumOfNegativeByCycle(arr)));
        System.out.println(Arrays.toString(numOfPositiveAndSumOfNegativeByCycle(emptyArray)));

        System.out.println(Arrays.toString(numOfPositiveAndSumOfNegativeByCycle(arr2)));


    }

    public static int[] numOfPositiveAndSumOfNegativeByCycle(int[] array) {
        int sumOfPositive = 0;
        int sumOfNegativeNumbers = 0;

        if (Objects.nonNull(array)){
            for (int i : array) {
                if (i > 0) {
                    sumOfPositive++;
                }
                if (i < 0) {
                    sumOfNegativeNumbers += i;
                }
            }
        }
        if (Objects.isNull(array) || array.length == 0) {
            return new int[0];
        }
        return new int[]{sumOfPositive, sumOfNegativeNumbers};
    }

}
