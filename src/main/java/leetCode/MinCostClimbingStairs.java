package leetCode;

public class MinCostClimbingStairs {
/* https://leetcode.com/problems/min-cost-climbing-stairs/description/ */
	static int result = 0;
	public static int minCostClimbingStairs(int[] cost) { // bottom up 방식 index = 0 -> n
		int n = cost.length;
		// dp[n] 이 존재해야 하므로.
		int[] dp = new int[n+1];
		// dp[0], dp[1] 는 자동적으로 0
		for(int i=2; i <= n; i++) {
			dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
		}
		return dp[n];
    }
}
