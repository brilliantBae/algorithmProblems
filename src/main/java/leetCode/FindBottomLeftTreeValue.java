package leetCode;
import java.util.*;

/* 
 * <Tree BFS>
 * https://leetcode.com/problems/find-bottom-left-tree-value/description/ 
 */
public class FindBottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> lastRow = new ArrayList<>();
        int maxDepth = findMaxDepth(root, 0);
        q.offer(root);
        int count = 0;
        while(!q.isEmpty()){
            count++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                int lastRowElement = q.poll().val;
                if(count == maxDepth + 1) lastRow.add(lastRowElement);
            }
        }
        return lastRow.get(0);
    }
    
    public int findMaxDepth(TreeNode root, int max){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return max;
        max++;
        return Math.max(findMaxDepth(root.left, max), findMaxDepth(root.right, max));
    }
}
