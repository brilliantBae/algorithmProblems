package leetCode;

/* https://leetcode.com/problems/symmetric-tree/description/ */

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSymmetric(TreeNode root) {
	       return helper(root, root);
	}
	/* 재귀호출 logic
	 * 1. 값을 비교한다.
	 * 2. 알맞은 위치의 노드로 root 를 변경한다.
	 */
	 public boolean helper(TreeNode p, TreeNode q) {
		 	// null check 
	        if(p == null || q == null) return p == q;
	        if(p.val != q.val) return false;
	        return helper(p.left, q.right) && helper(p.right, q.left);
	  }
}
