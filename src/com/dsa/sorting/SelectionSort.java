package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String []args) {
        int []arr = {2, 4, 6, 8, 1};

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
