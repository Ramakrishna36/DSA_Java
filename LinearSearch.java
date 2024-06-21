package jav.Rk;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int target;
        Scanner in = new Scanner(System.in);

        System.out.println("enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter target :");
        target = in.nextInt();

        int index = search(arr, target);
        System.out.println("index is at " + index);

    }

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        System.out.println("element not present");
        return -1;
    }
}
