package programmers;

import java.util.Arrays;

class NoOvertime {
    public int noOvertime(int no, int[] works) {
        // base case
        if(no == 0){
            int result = 0;
            for(int i : works){
                result += i*i;
            }
            return result;
        }
        // 1. 최대값 구하기
        int max = works[0];
        for(int i : works){
            if(max < i) max = i;
        }
        // 2. index구해 1빼기
        int i = Arrays.asList(works).indexOf(max);
        works[i] -= 1;
        return noOvertime(no-1, works);
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        System.out.println(c.noOvertime(4,test));
    }
}