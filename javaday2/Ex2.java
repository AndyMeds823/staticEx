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
public class Ex2 {
    public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    System.out.println("Write a sentence : ");
    String sentence = read.nextLine();
    System.out.println("The senteces contains "+count_W(sentence)+" words");
    }
    public static int count_W(String sentence){
    int numWords = 0;
    if(!(" ".equals(sentence.substring(0,1))) || !(" ".equals(sentence.substring
        (sentence.length()-1)))){
     for(int a= 0; a<sentence.length();a++ ){
         if(sentence.charAt(a)==' '){
         numWords++;
      }
     }
     numWords=numWords+1;
    }
   return numWords;
  }
}
