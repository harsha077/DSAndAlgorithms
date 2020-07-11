package Trees;

public class CreateBinaryTree1 {

	public static Node root;
	
	public static void main(String[] args) {
		
		CreateBinaryTree1 cbt = new CreateBinaryTree1();
		
		cbt.test();
	}
	
	public void test()
	{
		CreateBinaryTree1 cbt = new CreateBinaryTree1();
		
		cbt.addNode(2);
		System.out.println(root.intValue);
	}
		public void addNode(int intInpValue){
		if(root == null){
			root = new Node(intInpValue);
			return;
		}
		
		Node temp = root;
		
		while(temp!=null){
			if(temp.intValue > intInpValue){
				if(temp.left == null){
					temp.left = new Node(intInpValue);
				}else{
					temp = temp.left;
				}
			}
			
			if(temp.intValue < intInpValue){
				if(temp.right == null){
					temp.right = new Node(intInpValue);;
				}else{
					temp = temp.right;
				}
			}
		}
	}
	
	

}

class Node{
	int intValue;
	Node left = null;
	Node right = null;
	
	public Node(int intValue){
		this.intValue = intValue;
	}
}
 