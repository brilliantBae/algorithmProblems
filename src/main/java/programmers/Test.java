package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        for(int i =0; i < words.length; i++){
            if(Arrays.asList(words).contains(words[i])){
                answer[0] = i%n +1;
                answer[1] = i/n +1;
                return answer;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
    }

}
