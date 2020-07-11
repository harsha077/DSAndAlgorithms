package RecursionAndDynamicP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfSet {
    public Character[] set = null;
    public ArrayList<ArrayList<Character>> ll = new ArrayList<ArrayList<Character>>();

    /*public void subsets(Character[] set){
        this.set = set;
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<set.length;i++){

        }
    }*/

     public void permute(){

     }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        int pntr1 = 0;
        while(pntr1 < nums.length){
            
            pntr1++;
        }
        return resList;
    }

    public static void main(String[] args) {
        int[] set = {1,2,3};
        List<List<Integer>> resList = new SubsetsOfSet().subsets(set);
        System.out.println(resList);
    }
}
