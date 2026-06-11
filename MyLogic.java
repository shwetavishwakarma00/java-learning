import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     int[] arr = {1,2,3,4,5};

     for(int num : arr){
        if(num%2 == 0){
            System.out.println(num);
        }
     }

}
}