package leetCode;
import java.util.*;
/* https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/ */
public class BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> total = new ArrayList<>();
    public Queue<TreeNode> q = new LinkedList<>();
    
    /*
     * <Tree BFS>
     * 1. root 를 추가한다.
     * 2. 루트의 왼쪽, 오른쪽을 추가한다.
     * 3. 2번을 반복한다.
     */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		q.offer(root);
		// null check
		if(root == null) return total;
		
		while(!q.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = q.size();
			for(int i=0; i < size; i++) {				
				if(q.peek().left != null) {
					q.offer(q.peek().left);
				}
				if(q.peek().right != null) {
					q.offer(q.peek().right);
				}
				level.add(q.poll().val);
			}
			if(level != null) {
				// 0 자리에 계속 추가하면 오른쪽으로 shift 됨.
				// 따로 reverse 할 필요 없음.
				total.add(0, level);
			}
		}
		return total;
	}
	
}
