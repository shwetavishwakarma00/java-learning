import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static void main (String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username:");
    String username = sc.nextLine();

    

   if(username.equals("admin")){
    System.out.println("Enter OTP:");
    int otp = sc.nextInt();
    if(otp == 9878){
        System.out.println("Login successful");
    }
    else{
        System.out.println("Invalid OTP");
    }
   }else{
    System.out.println("Invalid username");
   }

    
} }