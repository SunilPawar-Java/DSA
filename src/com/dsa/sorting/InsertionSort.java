package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String []args){
        int[] arr = {10,5,50,23,78,54};

        for (int i=1; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[i] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
