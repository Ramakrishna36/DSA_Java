package jav.Rk;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int target;
        Scanner in = new Scanner(System.in);

        System.out.println("input array of 10");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("input target");
        target=in.nextInt();

        int index= Search(arr,target);

        if(index == -1){
            System.out.println("element not present");
        }
        else
            System.out.println(index);


    }

    public static int Search(int[]arr,int target) {
        int start = 0;
        int end = arr.length-1;

        while(end>=start) {
           int mid=start+(end-start)/2;

            if (target>arr[mid]) {
                start=mid+1;
            }
            else if (target < arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
