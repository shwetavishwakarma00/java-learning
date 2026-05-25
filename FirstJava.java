import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("enter operation");
        String operation = sc.nextLine();

       myCalc(operation);

} 
    public static void myCalc(String operation){
       if(operation == add){
        sum();
       }else if(operation == sub){
        sub();
       }else if(operation == mul){
        mul();
       }else if(operation == div){
        div();
       }else{
        System.out.println("invalid");
       }
    }
    public static int sum(int a, int b){
       int sum = a + b;
       System.out.println("addition of 2 numbers:" +sum);
       return sum;
    } 
    public static int sub(int a, int b){
       int sub = a - b;
       System.out.println("subtraction of 2 numbers:" +sub);
       return sub;
    }
    public static int mul(int a, int b){
       int mul = a * b;
       System.out.println("subtraction of 2 numbers:" +mul);
       return mul;
    }
    public static int div(int a, int b){
       int div = a / b;
       System.out.println("subtraction of 2 numbers:" +div);
       return div;
    }


}