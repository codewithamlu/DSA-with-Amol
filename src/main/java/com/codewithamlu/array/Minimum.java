/*
 *  title: Minimum element from the array
    date: 2023-02-22 18:28:41
 */

package com.codewithamlu.array;

import java.util.Scanner;

public class Minimum {
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

        System.out.println("Minimum value's index-> " + getMinimumIndex(arr));
        System.out.println("Minimum Value-> " + getMinimumItem(arr));
    }

    static int getMinimumItem(int[] arr) {
        /*
         * Assume smallest integer as maximum and then traverse array and check if its
         * greater than maximumm we have got earlier if yes then make it maximum
         */
        int minValue = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    static int getMinimumIndex(int[] arr) {
        /*
         * Assume first index has maximum value and then traverse array and check if its
         * greater than maximumm we have got earlier if yes then make it maximum index
         */
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
