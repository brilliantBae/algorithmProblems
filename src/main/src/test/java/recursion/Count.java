package recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Count {
    private int[] dp = new int[100];
    public void count(int n){
        System.out.println(n+"");
        if(n == 0) return;
        else count(n-1);
    }

    public int add(int a, int b, int sum){
        if(b == a-1) return sum;
        else{
            sum += b;
            b-=1;
            return add(a, b, sum);
        }
    }

    public int addArrays(int[] array, int index, int sum){
        sum += array[index];
        if(index == array.length-1) return sum;
        else return addArrays(array, index+1, sum);
    }

    public int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public int fibonaccidp(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    @Test
    public void addTest() {
        assertThat(add(1, 3, 0), is(6));
        int[] array = {1,2,3};
        assertThat(addArrays(array, 0, 0), is(6));
        assertThat(factorial(4), is(24));
        assertThat(fibonacci(50), is(89));

    }

}
