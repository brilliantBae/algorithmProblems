package leetCode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ClimbingStairsTest {
//	public static int[] d ;
	@Test
	public void climbStairsTest() {
//		d = new int [300000];
		int r = ClimbingStairs.climbStairs(3);
		assertThat(r, is(3));
	}

}
