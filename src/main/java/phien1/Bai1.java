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
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number=scanner.nextInt(10);
        if (number < 0){
            System.out.println("That number is negative");
        }
        else if (number > 0){
            System.out.println("That number is positive");
        }
        else {
            System.out.println("Number is neither negative nor positive");
        }
    }
}

