import java.util.Scanner;

public class Login {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String userName = sc.nextLine();
        System.out.println("Enter your password");
        String pass = sc.nextLine();

        login(userName, pass);

    }
 public static boolean checkUsername(String userName){
  
   if (userName.equals("ShwetaV")){
    System.out.println("thank u now enter password");
    return true;
   }else{
    System.out.println("userid is wrong, try again");
    return false;
   }
   
 }

 public static boolean checkPassword(String pass){
 
 if(pass.equals("Shweta@123")){
 System.out.println("loading");
 return true;
 }else{
  System.out.println("wrong password");
  return false;
 }
 
 }

 public static void login( String userName, String pass){
 boolean userOk = checkUsername(userName);
 boolean userPass = checkPassword(pass);

  if ( userOk &&  userPass){
    System.out.println("login successful");
  }else{
    System.out.println("not allowed");
  }
 }
}

