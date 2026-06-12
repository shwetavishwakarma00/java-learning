import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word: ");
     String word = sc.nextLine();
     char ch = ' ';
     int upperCase = 0;
     int lowerCase = 0;

     for(int i = 0; i < word.length(); i++){
        ch = word.charAt(i);
        if(Character.isUpperCase(ch)){
            upperCase++;
        }else if(Character.isLowerCase(ch)){
            lowerCase++;
        }
     }
     System.out.println("UpperCase: " +upperCase);
     System.out.println("LowerCase: " +lowerCase);


     

}
}