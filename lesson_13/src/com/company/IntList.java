package com.company;

import java.util.Arrays;

public class IntList {

    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmpArr;
        if(arr.length > 0) {
            tmpArr = new int[arr.length+1];
            System.arraycopy(arr, 0, tmpArr, 0, arr.length);
            tmpArr[arr.length] = value;
        } else {
            tmpArr = new int[]{value};
        }
        arr = tmpArr;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}