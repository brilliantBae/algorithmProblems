

import java.util.Arrays;
import java.util.Scanner;

public class Four {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] nums = sc.nextLine().split(" ");
      int[] ints = new int[3];
      for(int i=0; i < nums.length; i++){
          ints[i] = Integer.parseInt(nums[i]);
      }
      Arrays.sort(ints);
      System.out.println(ints[1]);
    }
}
