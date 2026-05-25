import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static int numberSquare(int a){
        int square = a * a;
        return square;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
          
        int sum =  numberSquare(a);
        System.out.println("square of number" +sum);

} }