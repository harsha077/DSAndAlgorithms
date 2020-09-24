package DynamicP1;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutDups {
    public String word;
    public int len;
    public int count = 0;

    public PermutationsWithoutDups(String word){
        this.word = word;
        this.len = word.length();
    }

    public ArrayList<String> permWithOutDups(){
        ArrayList<String> list = getPerms(word);
        return list;
        //moveStrLettersAround(0,word);
    }

    //1:My Solution, Time complexity: O(n^2)
    /*public void moveStrLettersAround(int st, String word){
       if(st == (len-1)) return;

       int curSubsLen = len - st;
       for(int i=0;i<curSubsLen;i++) {
           moveStrLettersAround(st + 1, word);
           if(st == len-2) {
               List<String> list = swapLetters(word.substring(st));
               String firstChar = word.substring(0, st);
               for (String restOfString : list) {
                   System.out.println(++count + " " + firstChar + restOfString);
               }
               break;
           }else {
               word = sendFirstCharToLast(st,word);
           }
       }
    }
    //1:My Solution, Time complexity: O(n^2)
    public List<String> swapLetters(String subStr){
        List<String> list = new ArrayList<>();
        int len = subStr.length();
        list.add(subStr);
        list.add(subStr.substring(1)+subStr.substring(0,1));
        return list;
    }
    //1:My Solution, Time complexity: O(n^2)
    public String sendFirstCharToLast(int index, String str){
        String beforeIndStr = str.substring(0,index);
        char moved = str.charAt(index);
        String resOfString = str.substring(index+1);
        return beforeIndStr+resOfString+moved;
    }*/

    //2:CCI Solution 1, Time complexity:
    public ArrayList<String> getPerms(String str){
        if(str == null) return null;

        ArrayList<String> permutations = new ArrayList<String>();
        if(str.length() == 0){
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getPerms(remainder);
        for(String word: words){
            for(int j=0;j<=word.length();j++){
                String s = insertCharAt(word,first,j);
                permutations.add(s);
            }
        }
        return permutations;
    }

    public String insertCharAt(String word, char c, int i){
        String start = word.substring(0,i);
        String end = word.substring(i);
        return start+c+end;
    }

    public static void main(String[] args) {
        String word = "acc";
        ArrayList<String> list = new PermutationsWithoutDups(word).permWithOutDups();
        for(String str: list){
            System.out.println(str);
        }
    }
}