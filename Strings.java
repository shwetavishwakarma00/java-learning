import java.util.Scanner;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        System.out.println("Enter a character: ");
        char chr = sc.next().charAt(0);
        int count = 0;
        
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == chr){
                count++;
            }
        }
        System.out.println(count);
    }
}