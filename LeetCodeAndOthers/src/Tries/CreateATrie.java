package Tries;

public class CreateATrie {
	
	static final int ALPHABET_SIZE = 26;
	
	class TrieNode{
		TrieNode[] children;
		boolean isEndOfWord;
		
		TrieNode(){
			isEndOfWord = false;
			for (int i = 0; i < ALPHABET_SIZE; i++) {
				children[i] = null;
			}
		}
	}
	
	public TrieNode root;
	
	public void insert(String str) {
		
		int strLen = str.length();
		TrieNode pCrawl = root;
		
		for (int i = 0; i < strLen; i++) {
			int index = str.charAt(i)-'a';
			if(pCrawl.children[index] == null) {
				pCrawl.children[index] = new TrieNode();
			}
			pCrawl = pCrawl.children[index];
		}
		
		pCrawl.isEndOfWord = true;
	}
	
	public boolean search(String str) {
		
		int strLen = str.length();
		TrieNode pCrawl = root;
		
		for(int i=0;i<strLen;i++) {
			int index = str.charAt(i)-'a';

			if(pCrawl.children[index]==null)
				return false;
			
			pCrawl = pCrawl.children[index];
		}
		
		return (pCrawl.isEndOfWord && pCrawl!=null);
	}
	
}


