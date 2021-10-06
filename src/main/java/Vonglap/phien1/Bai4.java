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
public class Bai4 {
    public static void main(String[] args){
        int a, count = 0;
        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter a number: ");
        a = input.nextInt();
 
        while (a <= 0) {
            System.out.println("number must bigger than 0!, enter again: ");
            a = input.nextInt();
        }
         
        while (a > 0) {
            a /= 10;
            count++;    // tăng biến count lên 1
        }
         
        System.out.println(count);
    }
}
