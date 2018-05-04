package Codility;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        if(A.length == 0) return 1;
        if(A.length ==1) {
            if(A[0] == 1) return 2;
            if(A[0] == 2) return 1;
        }
        for(int i=0; i <A.length-1; i++){
            if(A[i+1] - A[i] != 1) return A[i]+1;
        }
        if(A[A.length-1] == A.length+1){
            return A[0]-1;
        }
        else{
            return A[A.length-1] +1;
        }
    }

    public static void main(String[] args){

    }
}
