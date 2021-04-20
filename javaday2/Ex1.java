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
public class Ex1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String st = read.nextLine();
        System.out.print("There are"+" "+count_V(st)+" "+"vowels");
        }
    public static int count_V(String st){
    int count = 0;
    for(int t = 0; t < st.length();t++){
        char vw=st.charAt(t);
        if(vw=='a' || vw== 'e' || vw=='i' 
           || vw=='o'|| vw=='u'){
                count ++;
        }
      }
    return count;
    }
}
