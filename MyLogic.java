import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
        //User se number lo aur check karo even hai ya odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age >= 18  ){
            System.out.println("eligeblwe for vote");
        }else{
            System.out.println("not eligible");
        }
    }
}
