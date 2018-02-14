package backjune;
import java.util.*;
public class RGB {
	static int n, d[];
	static int[][] cost;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = new int[n+1];
		cost = new int[n+1][3+1];
	}
	
	public int findMin(int[][] arr) {
		int min = cost[1][1];
		for(int i=1; i < cost.length; i++) {
			if(min > cost[1][i]) min = cost[1][i];
		}
		return min;
	}
}
