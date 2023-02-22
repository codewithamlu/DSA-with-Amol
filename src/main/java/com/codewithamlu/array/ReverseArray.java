/*
 *  title: Program to reverse an Array
    date: 2023-02-22 13:26:462023-02-22 13:26:48
 */

package com.codewithamlu.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input n -> no of elements in array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Print the array
        System.out.println("Beofre Reverse");
        printArray(arr);

        System.out.println("After Reverse");
        printArray(reverseWithoutTempArray(arr));
        printArray(reverseWithTempArray(arr));
    
        System.out.println();
    }

    // Function for reverse
    static int[] reverseWithTempArray(int[] arr) {
        /*
         * Get items from end of first array and put at first of second.
         */
        int[] newArr = new int[arr.length];
        int n = arr.length - 1;
        for (int i = n; i >= 0; i--) {
            newArr[n - i] = arr[i];
        }
        return newArr;
    }

    static int[] reverseWithoutTempArray(int[] arr) {
        /*
         * Swap corresponding values i.e. first to last , second to second last and so on.
         */
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
