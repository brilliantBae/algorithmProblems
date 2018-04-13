package programmers;

import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new StringBuilder(String.valueOf(c)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
