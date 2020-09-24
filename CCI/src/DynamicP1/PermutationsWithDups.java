package DynamicP1;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationsWithDups {

    public ArrayList<String> permute(String word){
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = getPerms(word);
        list.addAll(set);
        return list;
    }

    public HashSet<String> getPerms(String word){
        HashSet<String> set = new HashSet<>();
        if(word.length() == 0){
            set.add("");
            return set;
        }

        char first = word.charAt(0);
        String remainder = word.substring(1);
        HashSet<String> perms = getPerms(remainder);
        for(String curWord: perms){
            for(int j=0;j<=curWord.length();j++){
                String val = insertChar(curWord,first,j);
                set.add(val);
            }
        }
        return set;
    }

    public String insertChar(String curWord,char first, int j){
        String start = curWord.substring(0,j);
        String end = curWord.substring(j);
        return start+first+end;
    }

    public static void main(String[] args) {
        String word = "accd";
        ArrayList<String> list = new PermutationsWithDups().permute(word);
        System.out.println(list);
    }

}
