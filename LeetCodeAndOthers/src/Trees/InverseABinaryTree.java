package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InverseABinaryTree {

	public static void main(String[] args) {
		CreateBinaryTree cbt = new CreateBinaryTree();
		Integer[] inpArr = {4,2,7,1,3,6,9};
		TreeNode root = cbt.createBinTreeFromArr(inpArr);
		TreeNode newRoot = invertTree(root);
		System.out.println(newRoot);
	}
	
	public static TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        TreeNode newRoot = new TreeNode(root.value);
        
        q1.add(root);
        q2.add(newRoot);
        
        while(!q1.isEmpty()){
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();
            
            if(node1.right!=null){
                node2.left = new TreeNode(node1.right.value);
                q1.add(node1.right);
                q2.add(node2.left);
            }
            if(node1.left!=null){
                node2.right = new TreeNode(node1.left.value);
                q1.add(node1.left);
                q2.add(node2.right);
            }
        }
        return newRoot;
    }
}
