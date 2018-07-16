package leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class SearchInsertPosition {
    private static final Logger log = LoggerFactory.getLogger(SearchInsertPosition.class);

    public int searchInsert(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }

        int[] newNums = new int[nums.length+1];

        for(int i=0; i < nums.length; i++){
            newNums[i] = nums[i];
        }
        newNums[newNums.length-1] = target;

        Arrays.asList(newNums).forEach(num -> log.debug(num +""));

        Arrays.sort(newNums);

        for(int i=0; i <newNums.length; i++){
            if(newNums[i] == target) return i;
        }
        return -1;
    }
}
