import java.util.Arrays;

public class Quicksort {
    public static int[] quicksort(int[] array) {
        System.out.printf("Array before quicksort: %s\n", Arrays.toString(array));
        quicksortRecursive(array, 0, array.length - 1);
        System.out.printf("Array after quicksort: %s", Arrays.toString(array));

        return array;
    }

    private static void quicksortRecursive(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int p = array[end];
        int i = start;
        int j = end - 1;

        while (i <= j) {
            while (i <= j && array[i] <= p) {
                i++;
            }

            while (j >= i && array[j] > p) {
                j--;
            }

            if (i < j) {
                swap(i, j, array);
            }
        }

        swap(i, end, array); // Pivot an seine endgültige Position bringen

        quicksortRecursive(array, start, i - 1);
        quicksortRecursive(array, i + 1, end);
    }

    private static void swap(int x, int y, int[] array) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}