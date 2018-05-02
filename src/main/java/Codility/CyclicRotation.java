package Codility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

class CyclicRotation {
    private static final Logger log = LoggerFactory.getLogger(CyclicRotation.class);

    /* 87% answer
    * The following issues have been detected: runtime errors.
    For example, for the input ([], 0) the solution terminated unexpectedly.

    static int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        if(K < A.length){
            for(int i=0; i <A.length; i++){
                if(i+K < A.length){
                    B[i+K] = A[i];
                }
                else{
                    B[i+K-A.length]= A[i];
                }
            }
        }
        else{
            return solution(A, K%A.length);
        }
        return B;
    }
    */
    static int[] solution(int[] A, int K) {
        int[] shifted = new int[A.length];
        for(int i=0; i < A.length; i++){
            if(i+K >= A.length){
                shifted[(i+K) % A.length] = A[i];
            }
            else{
                shifted[i+K] = A[i];
            }
        }
        return shifted;
    }

    public static void main(String[] args){
        int[] answer =solution(new int[]{}, 0);
        Arrays.stream(answer).forEach(a-> log.debug(String.valueOf(a)));
    }
}