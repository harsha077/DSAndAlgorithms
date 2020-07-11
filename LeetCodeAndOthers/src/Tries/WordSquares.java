package Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSquares {
	
	public static void main(String[] args) {
		String[] words = {"area","lead","wall","lady","ball"};
		
		WordSquares ws = new WordSquares();
		 
		ws.buildTrie(words);
		
	}

	 public List<List<String>> wordSquares(String[] words) {
	        List<List<String>> res = new ArrayList<>();
	        if(words == null || words.length == 0)
	            return res;
	        TrieNode root = buildTrie(words);
	        
	        return res;
	 }
	 
	private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for(String word: words) {
            TrieNode node = root;
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(!node.children.containsKey(c)) {
                    node.children.put(c, new TrieNode());
                }
                node.children.get(c).startWith.add(word);
                node = node.children.get(c);
            }
        }
        return root;
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    List<String> startWith;
    public TrieNode() {
        children = new HashMap<>();
        startWith = new ArrayList<>();
    }
}
