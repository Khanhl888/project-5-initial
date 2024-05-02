package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement Gnome Sort here
        int index = 0;
        while (index < data.length) {
            if (index == 0 || data[index].compareTo(data[index - 1]) >= 0) {
                index++;
            } else {
                swap(data, index, index - 1);
                index--;
            }
        }

}


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
        // TODO implement Cocktail Shaker Sort here
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
            swapped = false;
            for (int i = data.length - 2; i >= 0; i--) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }


    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here
        int n = data.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                T temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap].compareTo(temp) > 0; j -= gap) {
                    data[j] = data[j - gap];
                }
                data[j] = temp;
            }
        }

    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





