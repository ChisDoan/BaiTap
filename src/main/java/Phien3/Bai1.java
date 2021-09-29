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
public class Bai1 {
    public static void main(String[] args){
        System.out.print("Input a degree in Fahrenheit: ");
	Scanner input = new Scanner(System.in);
	double fahrenheit = input.nextDouble();
	double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
	System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
    }
}
