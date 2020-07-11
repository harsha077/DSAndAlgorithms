package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTree<T> {
	
	public static TreeNode root;
	
	public static void main(String... args) {
		Integer[] inpArr = {3,1,5,0,2,4,6,null,null,null,3};
		root = createBinTreeFromArr(inpArr);
		System.out.println(root);
	}
	
	/**
	 * 
	 * @param inpArr
	 * @return
	 */
	public static TreeNode createBinTreeFromArr(Integer[] inpArr) {
		
		int i=0;
		int len = inpArr.length;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root==null) {
			root = new TreeNode(inpArr[i]);
			i++;
		}
		q.add(root);
		while(i<len) {
			TreeNode node = q.poll();
			if(node.left==null) {
				if(inpArr[i] != null) {
					node.left = new TreeNode(inpArr[i]);
					q.add(node.left);
				}
				i++;
			}
			if(node.right==null && i<len) {
				if(inpArr[i] != null)
				{
					node.right = new TreeNode(inpArr[i]);
					q.add(node.right);
				}
				i++;
			}
		}
		
		return root;
	}
	
	public static TreeNode findNodeAndReturnIt(int value) {
		TreeNode resultNode = findNodeAndReturnIt(root,value);
		return resultNode;
	}
	
	private static TreeNode findNodeAndReturnIt(TreeNode mRoot,int value) {
		if(mRoot==null) {
			return null;
		}
		
		if(mRoot.value == value) {
			return mRoot;
		}
		
		TreeNode resultNode = findNodeAndReturnIt(mRoot.left,value);
		if(resultNode != null) {
			return resultNode;
		}
		resultNode = findNodeAndReturnIt(mRoot.right, value);
		
		return resultNode;
	}
	
	/**
	 * Another approach where nodes are arranged randonly in the tree.(unpredictable on which node will go where)
	 */
	/*public static TreeNode createBinTreeFromArr(Integer[] inpArr) {
		int i = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode node = new TreeNode(inpArr[i]);
		queue.add(node);
		
		TreeNode currentNode = null;
		int j = i;
		while(j<inpArr.length-1) {
			currentNode = queue.poll();
			j = j+1;
			if(j < inpArr.length) {
				if(currentNode.left == null && inpArr[j] != null) {
					currentNode.left = new TreeNode(inpArr[j]);
					queue.add(currentNode.left);
				}
			}
			j = j+1;
			if(j < inpArr.length) {
				if(currentNode.right == null && inpArr[j] != null) {
					currentNode.right = new TreeNode(inpArr[j]);
					queue.add(currentNode.right);
				}
			}
		}
		return node;
	}
	
	public void addNode(int value) {
		Random rnd = new Random();
		String direction = leftOrRight(rnd.nextInt());
		addNode(root,value,direction);
	}
	
	public void addNode(TreeNode node, int value ,String direction) {
		Random rnd = new Random();
		if(root == null) {
			root = node;
			return;
		}
		
		if(direction.equals("left")) {
			if(node.left != null) {
				addNode(node.left, value, leftOrRight(rnd.nextInt()));
			}else {
				node.left = new TreeNode(value);
			}
		}else {
			if(node.right != null) {
				addNode(node.right, value, leftOrRight(rnd.nextInt()));
			}else {
				node.right = new TreeNode(value);
			}
		}
	}
	
	public static String leftOrRight(int randomNum) {
		if(randomNum%2==0) {
			return "left";
		}else {
			return "right";
		}
	}*/
	
	
}
