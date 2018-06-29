package leetcode;

import java.util.Arrays;

/* LeetCode - https://leetcode.com/problems/find-the-difference/description/ */

public class FindtheDifference {

    public char findTheDifference1(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        for(int i=0; i < schar.length; i++){
            if(schar[i] != tchar[i]) return tchar[i];
        }
        return tchar[tchar.length-1];
    }

    public char findTheDifference2(String s, String t) {
        int[] sfre = new int[26];
        int[] tfre = new int[26];

        for(int i=0; i < s.length(); i++){
            sfre[s.charAt(i) - 'a']++;
        }
        for(int i=0; i < t.length(); i++){
            tfre[t.charAt(i) - 'a']++;
        }
        for(int i=0; i < tfre.length; i++){
            if(sfre[i] != tfre[i]) return (char)(i + 97);
        }
        return 'l';
    }
}
