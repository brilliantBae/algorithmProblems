package leetCode;
import java.util.*;

/* https://leetcode.com/problems/climbing-stairs/description/ */

public class ClimbingStairs {
	public static int[] d = new int[30000];
    public static int climbStairs(int n) {
    		if(n == 0) return 1;
        if(n == 1) return d[n] = 1;
        // 계산했으면 곧장반환.
        if(d[n] != 0) return d[n];
        return d[n] = climbStairs(n-1) + climbStairs(n-2);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}

}
