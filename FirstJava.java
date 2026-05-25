import java.util.Scanner;
//product name,quantity,price
class FirstJava{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("enter 3rd number:");
        int c = sc.nextInt();

        largeNumber(a, b, c);

} 
    public static int largeNumber(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+ "is gratest number");
        } else if(b>a && b>c){
            System.out.println(b+ "is gratest number");
        }else if(c>a && c>b){
            System.out.println(c+ "is gratest number");
        }else if(a==b && b==c && a==c){
            System.out.println("all numbers are equal");
        }else{
            System.out.println("invalid number");
        }

        return a;
    }

}