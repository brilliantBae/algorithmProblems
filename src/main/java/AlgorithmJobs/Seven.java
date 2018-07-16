package AlgorithmJobs;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args){
      String[] nums = new Scanner(System.in).nextLine().split(" ");
      int i=1;
      int first = Integer.parseInt(nums[0]);
      int second = Integer.parseInt(nums[1]);
      while(i <= second){
          if(i == 1 || i == second){
              for(int j=1; j<=first; j++){
                  System.out.print("*");
              }
              System.out.println("\n");
          }else{
              for(int j=1; j<=first; j++){
                  if(j==1 || j==first) System.out.print("*");
                  else System.out.print(" ");
              }
              System.out.println("\n");
          }
          i++;
      }
    }
}
