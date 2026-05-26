import java.util.Scanner;

public class MiniAtm {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your pin:");
    int pin = sc.nextInt();
    System.out.println("What u want to do:");
    int action = sc.nextInt();
    System.out.println("Enter amount u want withDraw:");
    int amount = sc.nextInt();

    withDrawMoney(action, amount, pin);
    }
    public static boolean checkPin(int pin){
        if(pin==224456){
            System.out.println("PIN verified");
            return true;
        }else{
            System.out.println("Wrong PIN");
            return false;
        }
    }
    public static boolean checkBalance(int action){
        int balance = 5000;
        if ( action == 1 ){
            System.out.println("your balance is:" + balance);
            return true;
        }else{
            System.out.println("no balance");
            return false;
        }
    }
    public static void withDrawMoney(int action, int amount, int pin){
    int balance =5000;

    boolean pinOk = checkPin(pin);
    if(pinOk){
        if(action == 1){
            checkBalance(action);
        }
        else if(action == 2){
            if(amount <= balance){
                int withDrawAmount = balance - amount;
                System.out.println("Your withdraw amount: " +withDrawAmount);
            }else{
                System.out.println("not balnced amount");
            }
        }else{
            System.out.println("wrong option");
        }
    }
    
}}
