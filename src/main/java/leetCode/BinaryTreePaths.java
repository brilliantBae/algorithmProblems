package leetCode;
import java.util.*;

/* https://leetcode.com/problems/binary-tree-paths/description/ */
public class BinaryTreePaths {
	public List<String> paths = new ArrayList<>();
	public String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> binaryTreePaths1(TreeNode root) {
		if(root == null) return paths;
		else s += root.val;
		if(root.right == null && root.left == null) {
			paths.add(s);
			return paths;
		}
		s += "->";
		List<String> totalPaths = new ArrayList<>(binaryTreePaths(root.left));
		totalPaths.addAll(binaryTreePaths(root.right));
		return totalPaths;
    }
	
	public List<String> binaryTreePaths(TreeNode root) {
		if(root == null) return null;
		s += root.val;
		if(root.right == null && root.left == null) {
			paths.add(s.toString());
			return paths;
		}
		s += "->";
		binaryTreePaths(root.left).addAll(binaryTreePaths(root.right));
		return binaryTreePaths(root.left);
    }
}
