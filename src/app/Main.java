package app;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int[] numbers =  {5, 12, 3, 87, 42};

        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Sorted output: " + Arrays.toString(utils.mergeSort(numbers)));

        System.out.println("Input: " + Arrays.toString(utils.mergeSort(numbers)));
        System.out.println("Find index of 3: " + utils.find(utils.mergeSort(numbers), 3));

        System.out.println("Input: " + Arrays.toString(utils.mergeSort(numbers)));
        System.out.println("Find index of 31: " + utils.find(utils.mergeSort(numbers), 31));
    }
}
