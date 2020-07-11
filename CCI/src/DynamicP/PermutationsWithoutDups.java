package DynamicP;

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

    public void permWithOutDups(){
        moveStrLettersAround(0,word);
    }

    //My Solution
    public void moveStrLettersAround(int st, String word){
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

    public List<String> swapLetters(String subStr){
        List<String> list = new ArrayList<>();
        int len = subStr.length();
        list.add(subStr);
        list.add(subStr.substring(1)+subStr.substring(0,1));
        return list;
    }

    public String sendFirstCharToLast(int index, String str){
        String beforeIndStr = str.substring(0,index);
        char moved = str.charAt(index);
        String resOfString = str.substring(index+1);
        return beforeIndStr+resOfString+moved;
    }

    public static void main(String[] args) {
        String word = "abc";
        new PermutationsWithoutDups(word).permWithOutDups();
    }
}