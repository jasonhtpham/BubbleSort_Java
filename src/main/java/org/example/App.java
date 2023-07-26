package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Integer[] arr1 = { 64, 34, 25, 12, 22, 11, 90 };
        Integer[] arr2 = { 10, 20, 30, 40, 50 };
        Integer[] arr3 = { 5, 4, 3, 2, 1 };
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        Integer[] sortedArr1 = bubbleSort.sort(arr1);
        System.out.println("Sorted Array 1: " + Arrays.toString(sortedArr1));
        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        Integer[] sortedArr2 = bubbleSort.sort(arr2);
        System.out.println("Sorted Array 2: " + Arrays.toString(sortedArr2));
        System.out.println("Original Array 3: " + Arrays.toString(arr3));
        Integer[] sortedArr3 = bubbleSort.sort(arr3);
        System.out.println("Sorted Array 3: " + Arrays.toString(sortedArr3));
    }
}