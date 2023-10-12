package com.cwc.study.group3.day1;

import java.util.Scanner;

public class chap1 {
    public static void main(String[] args) {
        /*1) Hello World 치기*/

        System.out.println("Hello World!");

        /*2) A+B=? (0 < A, B < 10)*/

        int A=3;
        int B=6;
        System.out.println(A+B);

        /*3) A-B=? (0 < A, B < 10)*/

        System.out.println(A-B);

        /*4) AxB=? (0 < A, B < 10)*/

        System.out.println(A*B);

        /*5) A/B=? (0 < A, B < 10)*/

        System.out.println(A/B);

        /*6) A+B,A-B,A*B,A/B,A%B (1 ≤ A, B ≤ 10,000)*/
        int plus = A+B;
        int minus = A-B;
        int multi = A*B;
        int div = A/B;
        int mod = A%B;

        System.out.println("A + B = "+plus);
        System.out.println("A - B = "+minus);
        System.out.println("A * B = "+multi);
        System.out.println("A / B = "+div);
        System.out.println("A % B = "+mod);



        /*7)준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
        *   준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.*/
        Scanner sc =new Scanner(System.in);
        System.out.print("아이디 : ");
        String str = sc.nextLine();
        System.out.println(str + "??!");




    }

}
