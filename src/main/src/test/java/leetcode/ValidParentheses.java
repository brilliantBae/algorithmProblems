package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/* LeetCode :  https://leetcode.com/problems/valid-parentheses/description/ */

public class ValidParentheses {

    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();

        if(brackets.length % 2 != 0) return false;
        if(brackets.length == 0) return true;

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');

        Stack<Character> stack = new Stack<>();
        // 왼쪽 괄호면 스택에 insert, 오른쪽 괄호 등장하면 짝 맞는지 검사
        for(int i=0; i < brackets.length; i++){
            if(brackets[i] == '(' || brackets[i] == '[' || brackets[i] == '{'){
                stack.push(brackets[i]);
            } else{
                if(stack.empty()) return false;
                char target = stack.pop();
                if(!pairs.get(target).equals(brackets[i])) return false;
            }
        }

        if(stack.empty()) return true;
        return false;
    }

    @Test
    public void isValidTest() {
        assertThat(isValid("([)]"), is(false));
        assertThat(isValid("()[]{}"), is(true));

    }
}
