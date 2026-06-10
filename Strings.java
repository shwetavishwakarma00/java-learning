import java.util.Scanner;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance: ");
        String sentance = sc.nextLine();
        
        String[] word = sentance.trim().split("\\s+");
        System.out.println(word.length);
    }
}