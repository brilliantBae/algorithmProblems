package Codility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ReverseArray {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ReverseArray.class);

    public static int[] reverse(int[] arr){
        for(int i=0; i < arr.length/2; i++){
            int temp1 = arr[i];
            int temp2 = arr[arr.length-1-i];
            arr[i] = temp2;
            arr[arr.length-1-i] = temp1;
        }
        return arr;
    }

    public static void main(String[] args){
      int[] answer = reverse(new int[]{1,2,3,4,5});
      Arrays.stream(answer).forEach(a->log.debug(a+""));
    }
}
