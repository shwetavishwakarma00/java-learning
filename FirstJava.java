import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static int evenOdd(int a){
        if (a%2 == 0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }

        return a;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
          
        int sum =  evenOdd(a);
        

} }