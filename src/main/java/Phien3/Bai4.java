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
public class Bai4 {
    public static void main (String[] args ){
    Scanner input= new Scanner(System.in);
    int m;
    System.out.println("Input the number of minutes:");
    m=input.nextInt();
    System.out.println(m+ "minutes is approximately "+(m/525949)+" year and "+((m%525949)/1440)+" day");
    
    }  
}
