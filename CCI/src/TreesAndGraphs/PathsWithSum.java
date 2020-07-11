package TreesAndGraphs;

import java.util.HashMap;
import java.util.Stack;

public class PathsWithSum {

	//public static int count = 0;
	public static TreeNode root = null;
	public static void main(String[] args) {
		CreateBinaryTree cbt = new CreateBinaryTree();
		//Integer[] inpArr = {5,2,-22,3,-8,-12,12,0,4,11,-12,null,null,20,15};
		Integer[] inpArr = {10,5,-3,3,1,null,11,3,-2,null,2};
		root = cbt.createBinTreeFromArr(inpArr);
		//int count = pathWithSum(root,0,new Stack<TreeNode>(),10,0);
		int count = countPathWithSum(root,8);
		System.out.println(count);
		/*int count = pathWithSum(root,0,10,0);
		System.out.println(count);*/
	}
	
	public static int countPathWithSum(TreeNode root, int targetSum) {
		return countPathWithSum(root, targetSum, 0, new HashMap<Integer, Integer>());
	}
	
	public static int countPathWithSum(TreeNode node, int targetSum, int runningSum, HashMap<Integer,Integer> pathCount) {
		
		if(node == null) return 0;
		
		runningSum += node.value;
		int sum = runningSum - targetSum;
		int totalPaths = pathCount.getOrDefault(sum, 0);
		
		if(runningSum == targetSum) {
			totalPaths++;
		}
		
		incrementHashTable(pathCount, runningSum,1);
		totalPaths += countPathWithSum(node.left, targetSum, runningSum, pathCount);
		totalPaths += countPathWithSum(node.right, targetSum, runningSum, pathCount);
		incrementHashTable(pathCount, runningSum, -1);
		return totalPaths;
	}
	
	public static void incrementHashTable(HashMap<Integer,Integer> hashTable, int key, int delta) {
		int newCount = hashTable.getOrDefault(key, 0) + delta;
		if(newCount == 0) {
			hashTable.remove(key);
		}else {
			hashTable.put(key, newCount);
		}
	}

	
	/*public static int pathWithSum(TreeNode mRoot,int sum, Stack<TreeNode> stack, int target,int count) {
		if(mRoot==null) {
			return count;
		}
		
        Stack<TreeNode> stackCopy = (Stack<TreeNode>) stack.clone();
        Stack<TreeNode> tempStack = (Stack<TreeNode>)stack.clone();
		int currentSum = mRoot.value;
		while(!tempStack.isEmpty()) {
			TreeNode node = tempStack.pop();
			currentSum = currentSum+node.value;
			if(currentSum==target) {
				count=count+1;
			}
		}
		stackCopy.add(mRoot);
		sum = sum + mRoot.value;
		if(sum==target) {
			count=count+1;
		}
		count = pathWithSum(mRoot.left, sum, stackCopy, target, count);
		count = pathWithSum(mRoot.right, sum, stackCopy, target, count);
		
		return count;
	}*/
	
	/*public static int pathWithSum(TreeNode mRoot,int sum,int target,int count) {
		if(mRoot==null) {
			return count;
		}
		
		sum = sum + mRoot.value;
		if(sum==target) {
			count=count+1;
		}
		
		count = pathWithSum(mRoot.left,sum,target,count);
		count = pathWithSum(mRoot.right,sum,target,count);
		
		return count;
	}*/
}
