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
public class Bai7 {
     public static void main(String[] args) {
    int n, soDu, tong = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao so nguyen duong bat ky: ");
    n = scanner.nextInt();
         
    while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
         
    System.out.println("Tong cac chu so = " + tong);
}
}

