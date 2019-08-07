package com.sparta.sn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 9, 2, 1, 10, 7};
        new BubbleSorter().bubbleSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
