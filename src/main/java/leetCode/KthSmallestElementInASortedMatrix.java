package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> minHeap = new ArrayList<>();
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix.length; j++){
                minHeap.add(matrix[i][j]);
                if(minHeap.get(minHeap.size()-1) > minHeap.get(minHeap.size()-2)) {
                    int temp1 = minHeap.get(minHeap.size() - 1);
                    int temp2 = minHeap.get(minHeap.size()-2);
                    minHeap.set(minHeap.size() - 1, temp2);
                    minHeap.set(minHeap.size() - 2, temp1);
                }

            }
        }
        return minHeap.get(k-1);
    }
}
