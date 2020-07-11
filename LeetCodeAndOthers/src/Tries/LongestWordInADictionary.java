package Tries;

import java.util.HashSet;
import java.util.Set;

public class LongestWordInADictionary {

	public static void main(String... args) {
		//String[] words = {"w","wo","wor","bor","worl","world","worlds"};
		String[] words = {"w","wo","bo","borl","b","wor","worl","bor"};
		System.out.println(longestWord(words));
	}
	
	 public static String longestWord(String[] words) {
	        String ans = "";
	        Set<String> wordset = new HashSet();
	        for (String word: words) wordset.add(word);
	        for (String word: words) {
	            if (word.length() > ans.length() ||
	                    word.length() == ans.length() && word.compareTo(ans) < 0) {
	                boolean good = true;
	                for (int k = 1; k < word.length(); ++k) {
	                    if (!wordset.contains(word.substring(0, k))) {
	                        good = false;
	                        break;
	                    }
	                }
	                if (good) ans = word;
	            }    
	        }
	        return ans;
	    }
}
