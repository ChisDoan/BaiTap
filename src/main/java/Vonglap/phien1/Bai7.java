/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vonglap.phien1;

/**
 *
 * @author GIGA
 */
public class Bai7 {
    public static void main(String[] args) {
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Chuoi Fibonacci voi "+count+" so la: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println();
    }
}
