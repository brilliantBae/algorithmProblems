package leetCode;
import java.util.*;
/* https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/ */
public class FindLargestValueInEachRow {
	public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxValues = new ArrayList<>();
        // null check
        if(root == null) return maxValues;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> oneLevel = new ArrayList<>();
            int size = q.size();
            for(int i=0; i <size; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                oneLevel.add(q.poll().val);
            }
            Collections.sort(oneLevel);
            int max = oneLevel.get(oneLevel.size()-1);
            maxValues.add(max);
        }
        return maxValues;
    }
}
