package com.epam.test.automation.java.practice3;


public class Main {
    private Main() {
    }

    public static int[] task1(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[array.length - 1 - i] % 2 == 0) {
                result[array.length - 1 - i] = array[i];
                result[i] = array[array.length - 1 - i];
            } else {
                result[i] = array[i];
                result[array.length - 1 - i] = array[array.length - 1 - i];
            }
        }
        if (array.length % 2 == 1)
            result[array.length / 2] = array[array.length / 2];
        return result;
    }

    public static int task2(int[] array) {
        int maxValue = 0;
        int firstEntryIndex = 0;
        int secondEntryIndex = 0;
        for (int j : array) {
            if (j > maxValue) maxValue = j;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                firstEntryIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == maxValue) {
                secondEntryIndex = i;
                break;
            }
        }

        return secondEntryIndex - firstEntryIndex;
    }


    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) matrix[i][j] = 1;
                else if (i > j) matrix[i][j] = 0;
            }
        }
        return matrix;
    }


}
