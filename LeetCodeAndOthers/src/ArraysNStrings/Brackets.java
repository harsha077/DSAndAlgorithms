package ArraysNStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Brackets br = new Brackets();
		
		System.out.println(br.checkString("{[]}"));
	}
	
	public boolean checkString2(String inputString)
	{
		return false;
		
	}
	
	public boolean checkString(String inputString){
        Map<Character,Character> map  = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
       
        Stack stack = new Stack();
        Character tempChar;
       
        for(int i=0;i<inputString.length();i++)
        {
            Character c = inputString.charAt(i);
            if(map.containsKey(c))
            {
                stack.push(c);
                continue;
            }
           
            tempChar = (Character)map.get(c);
           
            if(tempChar == stack.peek())
            {
                stack.pop();
            }
         }
        
         if(stack.empty())
         {
             return true;
         }      
        return false;
 }
}
