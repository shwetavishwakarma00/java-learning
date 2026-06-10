import java.util.Scanner;
import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance: ");
        String word = sc.nextLine();
        
        if(word.contains("Java")){
            System.out.println("Java found");
        }else{
            System.out.println("Not found");
        }

    }
}