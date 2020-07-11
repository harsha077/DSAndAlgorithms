package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNode<T> {
	
	public static RandomTreeNode root;

	public static void main(String[] args) {
		Integer[] inpArr = {3,5,2,6,9,2,10,11};
		root = createBinTreeFromArr(inpArr);
		RandomTreeNode randomTreeNode = getRandomNode(root);
		System.out.println(randomTreeNode.value);
	}
	
	public static RandomTreeNode getRandomNode(RandomTreeNode root) {
		Random ran = new Random();
		
		int count = countNodes(root);
		int id = ran.nextInt(count);
		RandomTreeNode randomTreeNode = getRandomNode(root,id);
		
		return randomTreeNode;
	}
	
	public static RandomTreeNode getRandomNode(RandomTreeNode mRoot, int id) {
		
		if(mRoot==null) {
			return null;
		}
		
		if(mRoot.id == id) {
			return mRoot;
		}
		
		RandomTreeNode tempRoot = getRandomNode(mRoot.left,id);
		if(tempRoot != null) {
			return tempRoot;
		}
		tempRoot = getRandomNode(mRoot.right,id);
		
		return tempRoot;
	}
	
	/**
	 * 
	 * @param inpArr
	 * @return
	 */
	public static RandomTreeNode createBinTreeFromArr(Integer[] inpArr) {
		
		int i=0;
		int len = inpArr.length;
		Queue<RandomTreeNode> q = new LinkedList<RandomTreeNode>();
		if(root==null) {
			root = new RandomTreeNode(inpArr[i],i);
			i++;
		}
		q.add(root);
		while(i<len) {
			RandomTreeNode node = q.poll();
			if(node.left==null) {
				if(inpArr[i] != null) {
					node.left = new RandomTreeNode(inpArr[i],i);
					q.add(node.left);
				}
				i++;
			}
			if(node.right==null && i<len) {
				if(inpArr[i] != null)
				{
					node.right = new RandomTreeNode(inpArr[i],i);
					q.add(node.right);
				}
				i++;
			}
		}
		
		return root;
	}
	
	public static int countNodes(RandomTreeNode node) {
		int count = countNodes(node,1);
		return count;
	}
	
	private static int countNodes(RandomTreeNode node, int count) {
		if(node==null) {
			return count-1;
		}
		
		count = countNodes(node.left,count+1);
		count = countNodes(node.right,count+1);
		return count;
	}
	
}

class RandomTreeNode<T>{
	T value;
	RandomTreeNode left,right;
	int id;
	
	public RandomTreeNode(T value,int id){
		this.value = value;
		this.id = id;
	}
}


