import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word: ");
     String word = sc.nextLine();
     char ch = ' ';
     for(int i = 0; i < word.length(); i++){
         ch = word.charAt(i);
     }
     System.out.println(word.charAt(0));
     System.out.println(ch);

}
}