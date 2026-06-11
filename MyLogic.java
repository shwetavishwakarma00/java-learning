import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
        //User se number lo aur check karo even hai ya odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
