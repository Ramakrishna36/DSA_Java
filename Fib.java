package jav.Rk;

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum =1;
        int newsum=0;

        System.out.println("enter number");
        int L=input.nextInt();

        while(L>0){
            sum=a+b;
            a=b;
            b=sum;
            L--;
            System.out.println(sum+" ");
        }



    }
}
