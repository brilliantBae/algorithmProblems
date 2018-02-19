package backjune;
import java.util.*;

public class Coin1 {
/* https://www.acmicpc.net/problem/2293 */
	// 순서에 상관없음.
	public static int[][] d = new int[100][100];
	/* 순서에 상관있는 경우 */
// 	public static int getCases(int n, int k, int[] values) {
// 		// base case
// 		if(k == 1 || k == 0) return d[n][k] = 1;
// 		// 계산된 적이 있으면,
// 		if(d[n][k] != 0) return d[n][k];
// 		for(int i=0; i < n; i++) {
// 			if(k >= values[i]) d[n][k] += getCases(n, k-values[i], values);
// 		}
// 		return d[n][k];
//	}
	
	public static int getCases(int n, int k, int[] values) {
		Arrays.sort(values);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		int[] values = new int[n];
		for(int i=0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		d = new int[n][k];
	}

}
