/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amedi
 */

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
       int year=0;
       String anio="";
       Scanner read=new Scanner(System.in);
       System.out.println("Enter a year:");
       year=read.nextInt();
       
       if(readYear(year)==false){
           anio=" not a leap year";
       }
       if(readYear(year)==true){
           anio=" a Leap year";
       }
       System.out.println(year+" is " +anio);
    }
    
    public static boolean readYear(int year){
        Boolean leapy=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leapy=true;
                } else{
                    leapy=false;
                }
            } else{
                leapy=true;
            }
        } else{
            leapy=false;
        }
     return leapy;
    } 
}