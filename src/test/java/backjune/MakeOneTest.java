package backjune;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MakeOneTest {

	@Test
	public void makeOneTest() {
		int count = MakeOne.makeOne(10);
		assertThat(count, is(3));
	}

}
