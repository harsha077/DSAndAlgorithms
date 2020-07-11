package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class CheckSubTree {
	
	public static void main(String[] args) {
		Integer[] inpArr = {1,2,3,5,9,7,8};
		CreateBinaryTree bt = new CreateBinaryTree();
		TreeNode root = bt.createBinTreeFromArr(inpArr);
		TreeNode subTreeRoot = bt.findNodeAndReturnIt(3);
		//TreeNode subTreeRoot = new TreeNode(3);
		
		System.out.println(findSubTreeRoot(root,subTreeRoot));
	}

	public static boolean findSubTreeRoot(TreeNode mRoot,TreeNode subTreeRoot) {
		boolean valid = false;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(mRoot);
		while(!q.isEmpty()) {
			TreeNode node = q.poll();
			if(node == subTreeRoot) {
				//call subtree comp method
				valid = compareSubTrees(node,subTreeRoot,true);
			}
			if(node.left!=null) {
				q.add(node.left);
			}
			if(node.right!=null) {
				q.add(node.right);
			}
		}
		return valid;
	}
	
	public static boolean compareSubTrees(TreeNode sRoot, TreeNode subTreeRoot, boolean valid) {
		
		if(sRoot == null && subTreeRoot == null) {
			return true;
		}
		
		if(sRoot != subTreeRoot) {
			return false;
		}
		
		boolean isValid = compareSubTrees(sRoot.left,subTreeRoot.left,valid);
		if(isValid == false) {
			return isValid;
		}
		isValid = compareSubTrees(sRoot.right, subTreeRoot.right, valid);
		
		return isValid;
	}
}
