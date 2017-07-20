package interview;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println("MergeSort");
        int[] input = {12, 4, 5, 2, 67, 4, 9, 4, 0, 234, 4};
        System.out.println("Before sorting:" + Arrays.toString(input));
        doMerge(input);
    }

    public static void doMerge(int[] array) {
        Merge_Sort(array, 0, array.length - 1);
    }

    public static void Merge_Sort(int[] A, int low, int high) {
        if (low < high) {
            int mid = (int) Math.floor((low + high) / 2);
            Merge_Sort(A, low, mid);
            Merge_Sort(A, mid + 1, high);
            Merge(A, low, mid, high);
        }
    }

    public static void Merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[1 + n1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i - 1];
        }

        int[] R = new int[1 + n2];
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j];
        }
        int i = 1, j = 1;
        for (int k = p; k < r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                j = j + 1;
            }
        }
    }
}
