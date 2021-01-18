package com.company;

import java.util.HashMap;

public class Utils {

    // Utility function to print a given array
    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Utility function for summing up the array
    static int sumArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    // Utility function for finding mode of the the array
    static int modeArray (int []arr){

        int maxCount = 1;
        int modeElement = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int j : arr) {
            if (hashMap.get(j) != null) {
                int count = hashMap.get(j);
                count++;
                hashMap.put(j, count);

                if (count > maxCount) {
                    maxCount = count;
                    modeElement = j;
                }
            } else {
                hashMap.put(j, 1);
            }
        }

        return modeElement;
    }

    // Utility function for finding median of the the array
    static float medianArray(int []arr){
        if(arr.length  % 2 != 0){
            return arr[arr.length / 2];
        }
        else{
            return (float)(arr[arr.length / 2 - 1] + arr[arr.length / 2] ) /2;
        }
    }

    // Utility function for finding numbers greater than average
    static void greaterThanAverageList(int[] arr, int average)
    {
        int n = arr.length;
        for (int j : arr) {
            if (j > average) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    static void evenNumbersList(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
