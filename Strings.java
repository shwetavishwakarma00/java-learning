import java.util.Scanner;
import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        int upperCase = 0;
        int lowerCase = 0;

        for(int i=0; i<(word.length()); i++){
            char ch = word.charAt(i);
        
            if(Character.isUpperCase(ch)){
                upperCase++;
            }else{
                lowerCase++;
            }
        }
        System.out.println("UpperCase: "+upperCase);
        System.out.println("LowerCase: "+lowerCase);

    }
}