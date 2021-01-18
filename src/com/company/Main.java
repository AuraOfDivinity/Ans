package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring a scanner instance to obtain user inputs
        Scanner scanner = new Scanner(System.in);

        // This solution uses quicksort to sort the content of the integer array.
        // This could have been more easily achieved using the Arrays.sort method (which also uses
        // an implementation of quicksort), but decided to implement
        // the quicksort from the ground up given the simplicity of the question.
        QuickSort sort = new QuickSort();

        int n;

        System.out.println("Please enter the number of elements to be evaluated.");
        n = scanner.nextInt();

        int[] numberArray = new int[n];

        // Obtaining user inputs
        for(int i = 0; i < n; i++){
            System.out.println("Please enter the element " +i+":");
            numberArray[i] = scanner.nextInt();
        }

        // Printing the content of the array before sorting
        System.out.println("Unsorted array");
        Utils.printArray(numberArray);

        // Sorting the array
        sort.sort(numberArray, 0, n -1);

        // Printing the content of the array after sorting
        System.out.println("Sorted array");
        Utils.printArray(numberArray);

        System.out.println("Smallest number: "+numberArray[0]);
        System.out.println("Largest number: "+numberArray[n - 1]);
        System.out.println("Amount of numbers: "+n);
        System.out.println("Total of numbers: "+ Utils.sumArray(numberArray));

        int average = Utils.sumArray(numberArray) / n;

        System.out.println("Average of numbers: "+ average);
        System.out.println("Mode of numbers: "+ Utils.modeArray(numberArray));
        System.out.println("Median of numbers: "+ Utils.medianArray(numberArray));
        System.out.println("List of greater than average  numbers: ");
        Utils.greaterThanAverageList(numberArray,average);
        System.out.println("List of even numbers: ");
        Utils.evenNumbersList(numberArray);
    }

}
