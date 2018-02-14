package backjune;
import java.util.*;

public class MakeOne {
	public static int n, d[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = new int[n+1];
		java.util.Arrays.fill(d, -1);
		System.out.println(makeOne(n));
	}
	
	public static int makeOne(int x) {
		if(x == 1) return 0;
		// 값이 계산되어 있으면 곧장 반환.
		if(d[x] > 0) return d[x];
		d[x] = makeOne(x-1) + 1;
		if(x % 2 == 0) {
			d[x] = Math.min(d[x], makeOne(x/2) + 1);
		}
		if(x % 3 == 0) {
			d[x] = Math.min(d[x], makeOne(x/3) + 1);
		}
		// 계산되어 있지 않으면 계산하고 그 값을반환.
		return d[x];
	}
}

