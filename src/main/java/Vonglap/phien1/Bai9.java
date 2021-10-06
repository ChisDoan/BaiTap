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
public class Bai9 {
    public static void main(String[] args) {
        int num, reversed = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        num = scanner.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("So dao nguoc: " + reversed);
    }
}
