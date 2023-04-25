//(Дополнительная) Реализовать алгоритм сортировки слиянием (первая)

import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {11,45,8,19,223,507,18,102,448,4};
        int[] result = addSort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] addSort(int[] arr) {
        int[] bArr1 = Arrays.copyOf(arr, arr.length);
        int[] bArr2 = new int[arr.length];
        int[] result = addSortIn(bArr1, bArr2, 0, arr.length);
        return result;
    }

    public static int[] addSortIn(int[] bArr1, int[] bArr2,
                                  int start, int endIndex) {
        if (start >= endIndex - 1) {
            return bArr1;
        }


        int middle = start + (endIndex - start) / 2;
        int[] sortedArr1 = addSortIn(bArr1, bArr2, start, middle);
        int[] sortedArr2 = addSortIn(bArr1, bArr2, middle, endIndex);


        int i1 = start;
        int i2 = middle;
        int end = start;
        int[] result = sortedArr1 == bArr1 ? bArr2 : bArr1;
        while (i1 < middle && i2 < endIndex) {
            result[end++] = sortedArr1[i1] < sortedArr2[i2]
                    ? sortedArr1[i1++] : sortedArr2[i2++];
        }
        while (i1 < middle) {
            result[end++] = sortedArr1[i1++];
        }
        while (i2 < endIndex) {
            result[end++] = sortedArr2[i2++];
        }
        return result;
    }
}

