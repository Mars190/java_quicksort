import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {2, 9, 3, 2, 0, 5, 2, 0, 8, 1};
        System.out.printf("Array before quicksort: %s\n", Arrays.toString(array));
        quicksort(array);
        System.out.printf("Array after quicksort: %s", Arrays.toString(array));
    }

    private static void quicksort(int[] array) {
        quicksortRecursive(array, 0, array.length - 1);
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
// ### Start ### //
// i = 1. Iterator; j = 2. Iterator; p = Pivot;
// p startet ganz hinten (länge - 1); i startet index 0; j startet index p - 1

// ### Vorgehen ### //
// i läuft nach rechts, bis zahl > p
// j läuft nach links, bis zahl < p
// Wenn i, j jeweils Zahl gefunden tauschen die Zahlen ihren Platz
// Weiter bis Überkreuzung, iterierung zuende

// ### Besonderes ### //
// wenn i & j sich gekreuzt haben = iterierung ende -> check ob [i] > [p], dann plätze tauschen
// pivot nach iterierung = sortiert
// einzelnes element in der teilliste = sortiert