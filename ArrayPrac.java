import java.util.Scanner;

public class ArrayPrac {
    public static void main(String args[]){
        int[] arr = {1,2,9,12};
        int sum =0;
        for(int i=0; i < arr.length; i++){
             sum += arr[i];
        }
        System.out.println(sum); 
    }
}
