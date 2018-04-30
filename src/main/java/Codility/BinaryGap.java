package Codility;

class BinaryGap {
/* runtime error */
    static int solution(int N) {
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