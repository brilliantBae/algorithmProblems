package leetCode;
import java.util.*;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int[] original = prices.clone();
        java.util.Arrays.sort(prices);
        for(int i= prices.length-1; i>0; i--) {
        		for(int j=0; j < i; j++) {
        			int originalIIndex = findIndex(prices[i], original);
        			int originalJIndex = findIndex(prices[j], original);
        			if(originalIIndex > originalJIndex) return prices[i] - prices[j];
        		}
        }
        return 0;
    }
	
	public static int findIndex(int target, int[] original) {
		int result = 0;
		for(int i=0; i < original.length; i++) {
			if(target == original[i]) result = i;
		}
		return result;
	}
	public static void main(String[] args) {

	}

}
