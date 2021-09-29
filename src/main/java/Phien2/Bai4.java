/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phien2;
import java.util.Scanner;
/**
 *
 * @author GIGA
 */
public class Bai4 {
    public static void main(String[] args) {
        int i,n=0,s=0;
	double avg;
	{
        System.out.println("Input the 5 numbers : ");  
	}
        for (i=0;i<5;i++){
            Scanner in = new Scanner(System.in);
            n = in.nextInt();    
            s +=n;
        }
	avg=s/5;
	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
    } 
}

