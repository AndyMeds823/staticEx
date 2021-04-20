
package javaday2;

/**
 *
 * @author amedi
 */
public class Ex4 {
    public static void main(String []args){
    System.out.println("Pentagonal numbers");
		pentaNums();
		System.out.println();
    }
    public static void pentaNums(){
    for( int a = 1; a <= 50; a++){
        int t = ((3 *(a * a))-a)/2;
        System.out.print(t + " ");
        if(a % 10 == 0){
         System.out.println();
        }
    }
  }
}