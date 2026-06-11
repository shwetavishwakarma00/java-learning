import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    public static void main(String args[]){
      int[] arr = {1,2,3,4,5,6,7,8};
      int sum = 0;

      for(int num : arr){      //Array ke har element ko ek-ek karke num me store karo
        sum += num;
      }
      System.out.println(sum);
}
}