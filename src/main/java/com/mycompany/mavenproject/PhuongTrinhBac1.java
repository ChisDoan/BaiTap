/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PhuongTrinhBac1 {
    public static void main (String[] args){
        int a,b;
        double x;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        a = input.nextInt();
        System.out.println("nhap b");
        b = input.nextInt();
          if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem.");
            } 
            else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } 
        else {
            x =  -b/a;
            System.out.println("Phuong trinh co duy nhat nghiem x:" + x);
        }
    }
}
