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
public class Bai5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float second;
        float mps, kph, Mph;
        System.out.println("Input distance in meters: ");
        float Distance=input.nextFloat();
        System.out.println("Input hour: ");
        float h=input.nextFloat();
        System.out.println("Input minutes: ");
        float m=input.nextFloat();
        System.out.println("Input seconds: ");
        float s=input.nextFloat();
        second = (h*3600) + (m*60) + s;
        mps = Distance / second;
        kph = ( Distance/1000.0f ) / ( second/3600.0f );
        Mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is "+mps);
	System.out.println("Your speed in km/h is "+kph);
	System.out.println("Your speed in miles/h is "+Mph);
    }
    
}
