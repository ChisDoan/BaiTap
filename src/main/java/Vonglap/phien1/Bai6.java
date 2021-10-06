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
public class Bai6 {
     public class Bai6 {boolean checkNguyenTo(int n){
  if(n<=2){
   return true;
  }else {
   for(int i =2;i<=Math.sqrt(n);i++){
    if(n % i == 0)
     return false;
   }
  }
  return true;
 }
 void inputNguyenTo(int n){
  for(int i = 1 ;i<n;i++){
   if(checkNguyenTo(i)){
    System.out.print(" " +i);
   }
  }
 }
   public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   Bai6 lk = new Bai6();
  int n =28;
  System.out.println("Nhap n = \n");
  n = sc.nextInt();
  lk.inputNguyenTo(n);
   }
  }
}       
        
    

