package AlgorithmJobs;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] nums = sc.nextLine().split(" ");
      int[] ints = new int[nums.length];
      for(int i=0; i < nums.length; i++){
          ints[i] = Integer.parseInt(nums[i]);
      }
      int i = ints[0];
      while(i < ints[1]){
          System.out.print(i+" ");
          i++;
      }
      while(i >= ints[2]){
          System.out.print(i+" ");
          i--;
      }
    }
}
