import java.util.Scanner;

public class MiniAtm {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = sc.nextInt();
        primeChecker(a);

    }
 public static void primeChecker(int a){
    boolean isPrime = true;

    for(int i = 2; i <= a/2; i++){
        if(a % i == 0 ){
            isPrime = false;
            break;
        }
    }
    if(isPrime){
        System.out.println("prime number");
    }else {
        System.out.println("not Prime number");
    }
 }
}

