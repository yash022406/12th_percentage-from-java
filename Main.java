package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Maths: ");
        int maths=sc.nextInt();
        System.out.println("Enter your marks in Physics: ");
        int phy=sc.nextInt();
        System.out.println("Enter your marks in Chemistry: ");
        int che=sc.nextInt();
        System.out.println("Enter your marks in English: ");
        int eng=sc.nextInt();
        System.out.println("Enter your marks in IP: ");
        int ip=sc.nextInt();

        float per = (maths + phy + che + eng + ip)/5.0f;
        System.out.println("Your percentage in 12th is: ");
        System.out.println(per);


    }
}
