package AlgorithmJobs;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] nums = sc.nextLine().split(" ");
      int first = Integer.parseInt(nums[0]);
      int second = Integer.parseInt(nums[1]);
      char[] alpha = new char[first];
      int j= 97;
      for(int i=0; i <alpha.length; i++){
          alpha[i] = (char)j;
          j++;
      }
    }

}
