/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaday2;

import java.util.Scanner;

/**
 *
 * @author amedi
 */
public class Ex3 {
    public static void main(String [] args){
    Scanner read = new Scanner (System.in);
    System.out.println("Enter a number : ");
    int nums = read.nextInt();
    System.out.println("The sum of "+nums+" is "+ addNums(nums));
    }
    public static int addNums(int nums){
        int x=0;
        int sum=0;
        while(nums>0){
            x=nums%10;
            sum=sum+x;
            nums=nums/10;
        }
        return sum;
    }
}
