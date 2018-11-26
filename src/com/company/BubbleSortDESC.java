package com.company;

public class BubbleSortDESC implements SortStrategy{
    public void  sort(int[] arr) {
        boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
                if(!swapped) break;
        }
    }
}
