package leetCode;

public class MaximumDepthOfBinaryTree {
	
	/*
	 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/ 
	 * <트리의 height 구하는 문제> 
	 * height = Max((왼쪽 subtree 최대 depth), (오른쪽 subtree 최대 depth)) + 1
	 * 
	 * 재귀호출 logic 
	 * 1. 1을 더한다. 
	 * 2. null 이면 max return 하고 아니면 이동한다.
	 */
	
	public int maxDepth(TreeNode root) {
		return maxDepthHelper(root, 0);
	}

	public int maxDepthHelper(TreeNode root, int max) {
		// base case
		if (root == null)
			return max;
		max++;
		return Math.max(maxDepthHelper(root.left, max), maxDepthHelper(root.right, max));
	}

	/* 
	 * max 를 global 로 지정하면 새로 max 를 구할때마다 값이 초기화 되지 않기 때문에 max 를 parameter 로 넘겨주어 
	 * 하나의 경로 당 하나의 max 값이 return 되도록 했다.
	 */
}
