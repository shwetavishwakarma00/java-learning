import java.util.Scanner;

public class MiniAtm {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    checkingVote(age);
    }

    public static int checkingVote(int age){
        if(age >=18){
            System.out.println("you are eglibel for vote");
        }else{
            System.out.println("NOT ELEIGBLE");
        }
        return age;
    }
}

