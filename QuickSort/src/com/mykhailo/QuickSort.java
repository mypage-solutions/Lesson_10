package com.mykhailo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {100, 37, 148, 11, -6, 896, 1328, -69, 0};
        System.out.printf("Unsorted Array%n%s%n", Arrays.toString(array));
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.printf("%nSorted Array%n%s%n", Arrays.toString(array));

    }

    static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int index = partition(array, low, high);
            quickSort(array, low, index - 1);
            quickSort(array, index + 1, high);
        }
    }
}

