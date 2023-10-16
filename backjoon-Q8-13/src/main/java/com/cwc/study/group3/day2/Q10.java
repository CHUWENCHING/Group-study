package com.ohgiraffers.Assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int D = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(D*(E%10));
        System.out.println(D*(E%100/10));
        System.out.println(D*(100/10));
        System.out.println(D*E);


    }
}
