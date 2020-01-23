/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fabio Curcio Madeira SBA18010
 */
public class Sort {

    ArrayList<String> resultBubbleSort = new ArrayList<>();

    /**
     *
     * @param array
     */
    public static void doBubbleSort(ArrayList<String> array) {
        int n = array.size();
        int nextI;
        for (int j = n; j >= 0; j--) {
            for (int i = 0; i < n - 1; i++) {
                nextI = i + 1;
                for (int c = 0; ((c < array.get(i).length()) && (c < array.get(nextI).length())); c++) {
                    if (array.get(i).charAt(c) > array.get(nextI).charAt(c)) {
                        changingPosition(i, nextI, array);
                        break;
                    } else if (array.get(i).charAt(c) != array.get(nextI).charAt(c)) {
                        break;
                    }

                }
            }

        }
        printUpdatedArray(array);
    }

    private static void changingPosition(int i, int smaller, ArrayList<String> arrayList) {
        ArrayList<String> tempList = new ArrayList<>();

        String[] array = new String[arrayList.size()];
        for (int j = 0; j < arrayList.size(); j++) {
            array[j] = arrayList.get(j);
        }
        String temp;
        temp = array[i];
        array[i] = array[smaller];
        array[smaller] = temp;
        for (int j = 0; j < array.length; j++) {
            tempList.add(array[j]);
        }
        arrayList.removeAll(arrayList);
        arrayList.addAll(tempList);

    }

    private static void printUpdatedArray(ArrayList<String> arrayList) {
        System.out.println("\n");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ", ");
            //System.out.println("\n");
        }
        System.out.println("\n");

    }

    /**
     *
     */
    public class QuickSort {

        private int array[];
        private int length;

        /**
         *
         * @param inputArr
         */
        public void sort(int[] inputArr) {
            if (inputArr == null || inputArr.length == 0) {
                return;
            }
            this.array = inputArr;
            length = inputArr.length;
            quickSort(0, length - 1);
        }

        private void quickSort(int lowerIndex, int higherIndex) {

            int i = lowerIndex;
            int j = higherIndex;
            // calculate pivot number, I am taking pivot as middle index number
            int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
            // Divide into two arrays
            while (i <= j) {
                /**
                 * In each iteration, we will identify a number from left side
                 * which is greater then the pivot value, and also we will
                 * identify a number from right side which is less then the
                 * pivot value. Once the search is done, then we exchange both
                 * numbers.
                 */
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    exchangeNumbers(i, j);
                    //move index to next position on both sides
                    i++;
                    j--;
                }
            }
            // call quickSort() method recursively
            if (lowerIndex < j) {
                quickSort(lowerIndex, j);
            }
            if (i < higherIndex) {
                quickSort(i, higherIndex);
            }
        }

        private void exchangeNumbers(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            System.out.println(temp);
        }

    }
}
