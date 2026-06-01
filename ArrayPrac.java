import java.util.Scanner;

public class ArrayPrac {
    public static void main(String args[]){
        int[] values = new int[5];

        Scanner sc = new Scanner(System.in);
        

        for(int i = 0; i< values.length; i++){
        System.out.println("Enter a number: ");
        values[i] =  sc.nextInt();       
     }
     System.out.println("numbers are: ");
     for(int i = 0; i<values.length; i++){
        System.out.println(values[i]);
     }
    }
}
