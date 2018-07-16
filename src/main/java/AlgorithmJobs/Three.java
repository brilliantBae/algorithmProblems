package AlgorithmJobs;

import java.util.Scanner;

public class Three {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] nums = sc.nextLine().split(" ");
      System.out.println(nums[3]+" "+nums[2]+" "+nums[0]+" "+nums[1]);
    }
}
