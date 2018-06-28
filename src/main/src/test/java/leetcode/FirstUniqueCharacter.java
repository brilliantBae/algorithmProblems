package leetcode;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/* LeetCode - https://leetcode.com/problems/first-unique-character-in-a-string/description/ */

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // 1. 원소 등장 개수 담은 Map 만들기
        for(int i=0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 0);
            } else {
              map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        // 1개만 등장하는 원소 없으면 -1 을 리턴
        if(!map.containsValue(0)) return -1;
        // 1개만 등장하는 원소들 담을 Set
        Set<Character> zeros = new HashSet<>();

        for(char c : map.keySet()){
            if(map.get(c) == 0){
                zeros.add(c);
            }
        }
        // 1개만 등장하는 원소들 중 가장 적은 인덱스 반환
        for(int i=0; i < s.length(); i++){
            if(zeros.contains(s.charAt(i))) return i;
        }
        return -1;
    }

    @Test
    public void firstUniqCharTest() {
        assertThat(firstUniqChar("loveleetcode"), is(2));
        assertThat(firstUniqChar("leetcode"), is(0));
    }
}
