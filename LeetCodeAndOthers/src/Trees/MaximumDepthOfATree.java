package Trees;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfATree {

	public static void main(String...args) {
		TreeNode node = new TreeNode(10);
		
		node.insert(4);
		node.insert(5);
		node.insert(3);
		node.insert(2);
		node.insert(1);
		node.insert(6);
		node.insert(17);
		node.insert(26);
		node.insert(11);
		node.insert(13);
		
		System.out.println(maxDepth(node));
	}
	
	public static int maxDepth(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		List<Integer> list = new ArrayList<Integer>();
		maxDepthHelper(root,1,list);
		return list.get(0);
	}
	
	public static void maxDepthHelper(TreeNode head,int level,List<Integer> list) {
		if(head==null) {
			return;
		}
		if(list.isEmpty()) {
			list.add(level);
		}else {
			if(level>list.get(0)) {
				list.set(0, level);
			}
		}
		maxDepthHelper(head.right, level+1, list);
		maxDepthHelper(head.left, level+1, list);
	}
	
	
}
