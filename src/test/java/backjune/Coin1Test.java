package backjune;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Coin1Test {

	@Test
	public void getCasesTest() {
		int[] values = { 1, 2, 5};
		int r = Coin1.getCases(3, 6, values);
		assertThat(r, is(15));
	}

}
