/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vonglap.phien1;
import java.util.Scanner;
/**
 *
 * @author GIGA
 */
public class Bai3 {
    public static void main(String[] args){
        int d,s=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        d = input.nextInt();
        for(int i=0;i<=d;i++){
            s+=i;
        }
        System.out.println(s);
    }
}
