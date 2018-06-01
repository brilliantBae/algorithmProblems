package hackerRank;
/*
<left rotation>
 int newIndex = (i + (a.length - d%a.length)) % a.length;

<right rotation>
 int newIndex = (i + (a.length + d%a.length)) % a.length;
 */

public class Rotation {
    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];
        for(int i=0; i <a.length; i++){
            b[(i + (a.length - d%a.length))%a.length] = a[i];
        }
        return b;
    }

    static int[] rotRight(int[] a, int d) {
        int[] b = new int[a.length];
        for(int i=0; i <a.length; i++){
            b[(i + (a.length + d%a.length))%a.length] = a[i];
        }
        return b;
    }
}
