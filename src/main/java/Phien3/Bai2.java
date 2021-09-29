/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phien3;
import java.util.Scanner;
/**
 *
 * @author GIGA
 */
public class Bai2 {
    public static main (String[] args){
     double i,m;
     Scanner input= new Scanner(System.in);
     System.out.println("Enter a value for inch");
     i =input.nextDouble();
     m= i/39.37;
     System.out.println("Value in meter is:" + m);
    }
    
}
