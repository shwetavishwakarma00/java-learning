import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word: ");
     String word = sc.nextLine();
     char ch = ' ';
     String reverse = " ";

     for(int i = (word.length()-1); i >= 0; i--){
        ch = word.charAt(i);  
        System.out.println(ch);
     }
}
}