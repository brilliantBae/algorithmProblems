package leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GuessNumberTest {
    public int guess(int n){
        int real = 1702766719;
        if(n < real){
            return 1;
        }else if(n > real){
            return -1;
        } else{
            return 0;
        }
    }

    public int guessNumber(int n) {
        int r = guess(n);
        if(r == -1) {
            return guessNumber(n-1);
        } else if (r == 1) {
            return guessNumber(n+1);
        } else {
            return n;
        }
    }

    @Test
    public void name() {
        assertThat(guessNumber(1000), is(1702766719));
    }
}
