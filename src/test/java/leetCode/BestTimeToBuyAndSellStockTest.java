package leetCode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

	@Test
	public void maxProfit() {
		int[] prices = {1,4,1,4,3,1};
		int r = BestTimeToBuyAndSellStock.maxProfit(prices);
		assertThat(r, is(3));
	}

}
