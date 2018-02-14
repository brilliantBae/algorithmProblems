package backjune;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CaptinLeeDasomTest {

	@Test
	public void initialize() {
//		int r = CaptinLeeDasom.intialize(1);
//		assertThat(r, is(1));
		
//		int r2 = CaptinLeeDasom.intialize(3);
//		assertThat(r2, is(10));	
	}

	@Test
	public void findClosest() throws Exception {
		int[] t = {1, 4, 10, 20};
		int r = CaptinLeeDasom.findClosest(10, t);
		assertThat(r, is(10));

	}
	
	@Test
	public void makeLargest() throws Exception {
		int[] t = {1, 4, 10, 20};
		int r = CaptinLeeDasom.makeN(5, t);
		assertThat(r, is(2));
	}
}
