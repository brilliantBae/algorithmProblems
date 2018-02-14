package backjune;
import java.util.*;
public class CaptinLeeDasom {
	static int count = 0;
	static int[] t;
//	static int[] d;
	public static void main(String[] args) {
		t = new int[300001];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i < t.length; i++) {
			intialize(i);
		}
//		d = new int[n];
//		java.util.Arrays.fill(d, -1);
		int count = makeN(n, t);
		System.out.println(count);
	}
	
	public static void intialize(int n) {
		if (n == 1) {
			t[n] = 1;
			return;
		}
		else {
			t[n] = t[n-1] + n * (n + 1) / 2;
			return;
		}
	}
	 
	public static int makeN(int n, int[] t) {
		if(n == 0) return count;
		int closest = findClosest(n, t);
		int result = n - closest;
		count++;
		return makeN(result, t);
	}
	public static int findClosest(int n, int[] t) {// n보다 작은 가장 가까운 t[] 값.
		int result = 0;
		for(int i=1; i < t.length+1; i++) {
			if(n < t[i]) {
				result = t[i-1];
				break;
			}	
		}
		return result;
	}
	
}
