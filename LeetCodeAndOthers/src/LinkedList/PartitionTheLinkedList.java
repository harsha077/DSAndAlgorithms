package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PartitionTheLinkedList {

    Node head;
   
    public static void main(String ...args)
    {
        List<Integer> list = new ArrayList<Integer>();
        SingleLinkedList sll = new SingleLinkedList();
        PartitionTheLinkedList ptll = new PartitionTheLinkedList();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(3);
       
       Node createdNode = sll.createLinkedList(list);
       sll.printNodes(createdNode);
       System.out.println("=============");
       createdNode = ptll.ReplNodes(createdNode, 3);
       sll.printNodes(createdNode);
       
    }
   
    
   
    public Node ReplNodes(Node inputHead,int x)
    {
    	
    	head = inputHead;
    	
        Node tempNode = head;
       
        Node currentNode = head;
       
        Node tailNode = null;
        
        Node tempTailNode = null;
       
        int savedNodeValue;
       
        while(tempNode != null)
        {
            if(tempNode.next == null)
            {
                tailNode = tempNode;
                tempTailNode = tempNode;
                break;
            }
            tempNode = tempNode.next;
        }
       
        while(currentNode!=null)
        {
        	if(currentNode == tempTailNode)
            {
            	break;
            }
        	
            if(x < currentNode.value)
            {
                savedNodeValue = currentNode.value;
                currentNode.value = currentNode.next.value;
                currentNode.next = currentNode.next.next;
                tailNode.next = new Node(savedNodeValue);
                tailNode = tailNode.next;
                tailNode.next = null;
            }else{
            	currentNode = currentNode.next;
            }
        }
        return head;
    }
}