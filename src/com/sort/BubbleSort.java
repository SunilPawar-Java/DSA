package com.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String []args){
        int []arr = {1,4,2,3,5};

        for (int i =0; i< arr.length; i++){
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j+1] < arr[j]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
