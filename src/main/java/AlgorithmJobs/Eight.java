package AlgorithmJobs;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String[] nums = sc.nextLine().split(" ");
      int[] sorted = new int[nums.length];
      for(int i=0; i <nums.length; i++){
          sorted[i] = Integer.parseInt(nums[i]);
      }
      Arrays.sort(sorted);
      for(int i=0; i <sorted.length; i++){
          System.out.print(sorted[i] +" ");
      }
    }
}
