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
public class Baitap1 {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    int x;
    System.out.println("input a number");
    x=input.nextInt();
    if (x > 0){
        System.out.println("Number is positive");
    }
    else if (x < 0){
        System.out.println("Number is negative");
    }
    else {
        System.out.println("Nymber is neither negative nor positive");
    }
}
  
}
