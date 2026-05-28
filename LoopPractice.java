import java.util.Scanner;

public class LoopPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int mul = 1;
        for(int i= 1; i<=10; i++){
            mul = num * i ;
            System.out.println(mul);
        }
    }
}
