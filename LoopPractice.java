import java.util.Scanner;

public class LoopPractice {
    public static void main(String args[]){
        int first = 0;
        int second = 1;
        
        for( int i = 0; i <= 50; i++){
           int next = first + second;
           System.out.println(next);
           first = second;
           second = next;
        }
            

        
    }
}
