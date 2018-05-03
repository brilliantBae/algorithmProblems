package Codility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

class OddOccurrencesInArray {
    private static final Logger log = LoggerFactory.getLogger(OddOccurrencesInArray.class);

    static int solution(int[] A) {
        Arrays.sort(A);

        int count = 0;
        if(A.length == 1) return A[0];
        for(int i=0; i < A.length-1; i++){
            count++;
            if(A[i] != A[i+1]){
                if(count %2 !=0) return A[i];
                else
                    count = 0;
            }
        }
        return A[A.length-1];
    }
    public static void main(String[] args){
        int answer = solution(new int[]{9,3,9,3,7,9,9});
        log.debug("answer: {}", answer);
    }
}