/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vonglap.phien2;
import java.util.Scanner;
/**
 *
 * @author GIGA
 */
public class Bai2 {
    public static void main(String[] args) {
        int number, temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhap vao 1 so bat ky: ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
        System.out.println(number + "! = " + giaiThua);
    }
 
}

