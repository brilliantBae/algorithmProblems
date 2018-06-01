package hackerRank;

import org.junit.jupiter.api.Test;

import static hackerRank.Rotation.rotLeft;
import static hackerRank.Rotation.rotRight;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class RotationTest {

    @Test
    public void rotation(){
        int[] a = {1,2,3,4,5};
        int d = 4;
        int[] left = {5,1,2,3,4};
        int[] right = {2,3,4,5,1};
        assertThat(rotLeft(a,d), is(left));
        assertThat(rotRight(a,d), is(right));
    }
}