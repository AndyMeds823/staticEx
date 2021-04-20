/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaday2;
import java.util.Scanner;
import java.util.StringTokenizer;
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
        if(sentence == null){
        System.out.println("It's Empty");
        return 0;
        }else{
            /*The tokenizer divides the string and assigns a token to each part*/
        StringTokenizer parts = new StringTokenizer(sentence);
        return parts.countTokens();
        }
  }

}
