import java.util.Scanner;

public class LoopPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for( int i = 2; i <= num/2; i++){
            if( num % i == 0){
               isPrime = false;
               System.out.println("not prime");
               break; 
            }else{
                isPrime = true;
                System.out.println("number is prime");
            }
        }
        
    }
}
