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
public class Bai8 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tim giai thua: ");
        number = scanner.nextInt();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Giai thua cua "+number+" la: "+fact);
        System.out.println();
        System.out.println("----------------------------");
    }
}
