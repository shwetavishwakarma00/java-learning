import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        square(num);
    }
    public static int square(int num){
        int squareNum = num * num ;
        System.out.println(squareNum);
        return num;
    }
}
