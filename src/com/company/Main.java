package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        NumberToWord obj=new NumberToWord();
        System.out.println(obj.convert(n));

    }

}
