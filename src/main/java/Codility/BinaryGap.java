package Codility;

class BinaryGap {
/* runtime error */

    static int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        for(int i =1; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(count > max) {max = count;}
                count = 0;
            }
            if(binary.charAt(i) == '0'){
                count++;
            }
        }
        return max;
    }
    static int solution_runtimeError(int N) {
        String binary = Integer.toBinaryString(N);
        return getMaxGap(binary, 1, 0, 0);
    }

    static int getMaxGap(String binary, int i, int max, int count){
        if(binary.charAt(i) == '1'){
            if(count > max) {max = count;}
            count = 0;
        }
        else if(binary.charAt(i) == '0'){
            count++;
        }
        if(i == binary.length()-1) return max;
        else return getMaxGap(binary, i+1, max, count);
    }
    public static void main(String[] args){
        int N = solution(5);
        System.out.println(N);
    }

}