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
public class Bai4 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Nhap a:");
        Scanner scanner  = new Scanner(System.in);
        a = scanner.nextInt();
        b = a % 7;
        switch (b){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 0:
            System.out.println("Sunday");
            break;
        }
    }
}

