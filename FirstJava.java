import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static int numberSums(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
          
        int sum =  numberSums(a , b);
        System.out.println("sum of number" +sum);

} }