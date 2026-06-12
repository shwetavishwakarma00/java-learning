import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
     int[] arr = {1,2,3,4,5,69};
     int sum = 0;
     int average = 0;

     for(int num : arr){
        sum = sum +num;
        average = sum / arr.length;
     }
     System.out.println("graest element: " +average);

}
}