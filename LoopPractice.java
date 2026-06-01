import java.util.Scanner;

public class LoopPractice {
    public static void main(String args[]){
        for(int i = 1; i<=6 ; i++){
            for(int y = 1; y <= (i-1) ; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
