package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeAndDeserialize {

	public static void main(String...args) {
		String str = "1,2,3,null,null,4,null,null,5,null,null,";
		
		SerializeAndDeserialize sd = new SerializeAndDeserialize();
		TreeNode root = sd.deserialize(str);
		
		
	}
	
	 public TreeNode deserialize(String data) {
		   String[] dataArr = data.split(",");
		   List<String> data_list = new ArrayList<String>(Arrays.asList(dataArr));
		return rdeserialize(data_list);
	}
	
	 public TreeNode rdeserialize(List<String> l) {
		 if(l.get(0).equals("null")) {
			 l.remove(0);
			 return null;
		 }
		 
		 TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
		 l.remove(0);
		 root.left = rdeserialize(l);
		 root.right = rdeserialize(l);
		 
		 return root;
	 }
}
