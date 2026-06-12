import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     int[] arr = {1,2,3,4,5,69};
     int gratest = arr[0];

     for(int num : arr){
        if(num > gratest){
           gratest = num; 
        }
     }
     System.out.println("graest element: " +gratest);

}
}