import java.util.Scanner;

public class MiniAtm {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = sc.nextInt();
        factCalc(a);

    }
 public static int factCalc(int a){
 int factorial = 1;
    for (int i = a; i >= 1; i--){
        factorial = factorial * i;
    }
    System.out.println("factorial:" +factorial);
    return a;
 }
}

