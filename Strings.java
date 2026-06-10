import java.util.Scanner;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        String reverse = "";
        
        for(int i=(word.length()-1); i>=0; i--){
            char ch = word.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}