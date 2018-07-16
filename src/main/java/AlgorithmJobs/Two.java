package AlgorithmJobs;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String[] nums = s.split(" ");
      System.out.println(Integer.parseInt(nums[0])+ Integer.parseInt(nums[1]) - Integer.parseInt(nums[2]));
    }
}
