/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phien1;

import java.util.Scanner;

/**
 *
 * @author GIGA
 */
public class Bai3 {
    public static void main(String[] args){
      float a;
      Scanner input= new Scanner(System.in);
      System.out.println("enter the number");
      a= input.nextFloat();
      if (a > 0){
          if (a<1){
            System.out.println("Positive small number");
          }
          else if (a < 1000000){
            System.out.println("Positive large number");
          }
          else {
            System.out.println("Positive number");
          }
      }
      else if (a < 0){
          if (Math.abs(a)<1){
            System.out.println("Negative small number"); 
          }
          else if (Math.abs(a)> 1000000){
               System.out.println("Negative large number");
          }
          else {
              System.out.println("Negative number");
          }
          
          
      }
      else {
          System.out.println("Zero");
      }
          
    }
}
