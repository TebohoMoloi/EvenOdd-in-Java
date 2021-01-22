package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        evenOdd();
    }
//
    static void evenOdd(){
        String s = " ";
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter : ");
        String myString = scanInput.next();
        if (myString.length() > 1) {
            for (int i = 0; i < myString.length(); i++)
                if (i % 2 == 0)
                    System.out.printf("%s", myString.charAt(i));
            System.out.printf("%s", s);
            for (int i = 1; i < myString.length(); i++)
                if (i % 2 == 1)
                    System.out.printf("%s", myString.charAt(i));
        }else
            System.out.println(myString);
    }
}
