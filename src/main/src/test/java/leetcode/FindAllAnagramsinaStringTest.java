package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindAllAnagramsinaStringTest {
    public List<Integer> findAnagrams(String s, String p) {
        int len = p.length();

        List<Integer> indices = new ArrayList<>();
        int i = 0;
        while(i + len <= s.length()){
            String sub =  s.substring(i, i+len);
            char[] subChar = sub.toCharArray();
            Arrays.sort(subChar);
            if(new String(subChar).equals(p)){ indices.add(i);
            }
            i++;
        }
        return indices;
    }

    @Test
    public void test() {
        assertThat(findAnagrams("cbaebabacd", "abc").size(), is(2));
    }
}
