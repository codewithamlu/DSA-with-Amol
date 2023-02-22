/*
 *  title: Maximum element from the array
    date: 2023-02-22 18:17:03
 */

package com.codewithamlu.array;

import java.util.Scanner;

public class Maximum {
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

        System.out.println("Maximum value's index-> " + getMaximumIndex(arr));
        System.out.println("Maximum Value-> " + getMaximumItem(arr));
    }

    static int getMaximumItem(int[] arr) {
        /*
         * Assume smallest integer as maximum and then traverse array and check if its
         * greater than maximumm we have got earlier if yes then make it maximum
         */
        int maxValue = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    static int getMaximumIndex(int[] arr) {
        /*
         * Assume first index has maximum value and then traverse array and check if its
         * greater than maximumm we have got earlier if yes then make it maximum index
         */
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
