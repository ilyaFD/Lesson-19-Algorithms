package app;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int middle = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public int find(int[] items, int target) {

        int left = 0;
        int right = items.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (items[mid] == target) {
                return mid;
            }

            if (items[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}