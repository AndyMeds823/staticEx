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
public class Ex6 {
     
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
 	double investment = 1000;
 	System.out.print("Enter rate of interest: ");
	double rate = in.nextDouble();
	System.out.print("Enter number of years: ");
	int year = in.nextInt();
	
	rate *= 0.03;
	
	System.out.println("Years       Value");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n",
                        futureInvestmentValue(investment, rate/12, i));
       }
	 }
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}

