package leetCode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MinCostClimbingStairsTest {

	@Test
	public void climbTest() throws Exception {
		int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int result = MinCostClimbingStairs.minCostClimbingStairs(cost);
		assertThat(result, is(6));
	}
}
