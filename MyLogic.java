import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
        //User se number lo aur check karo even hai ya odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
