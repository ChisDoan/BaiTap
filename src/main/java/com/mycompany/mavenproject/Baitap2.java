/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;
import java.util.Scanner;
/**
 *
 * @author GIGA
 */
public class Baitap2 {
    public static void main(String[] args){
        int a, b, c, d=0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the first number");
        a=input.nextInt();
        System.out.println("enter the second number");
        b=input.nextInt();
        System.out.println("enter the third number");
        c=input.nextInt();
        d =a; 
        if (b > d){
            d =b;
        }
        if (c > d){
            d = c;
        }  
        System.out.println("The greatest number is: " + d);
    }
}
