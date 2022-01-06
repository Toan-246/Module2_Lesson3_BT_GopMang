package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[]arr1 = {"A", "B", "C"};
        String[]arr2 = {"D", "E", "G"};

        String[]newArr = gopMang(arr1, arr2);

        System.out.println("Hiển thị mảng mới");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }
    }

    public static String[] gopMang(String[] arr1, String[] arr2) {
        String[] newArr = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArr[arr1.length + j] = arr2[j];
        }
        return newArr;
    }
}
