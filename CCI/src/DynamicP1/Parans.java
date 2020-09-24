package DynamicP1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parans {
    Set<String> resultSet = new HashSet<String>();
    //Combinations
   /*
    public static List<ArrayList<Integer>> resultList = new ArrayList<>();
    public static List<ArrayList<Integer>> tempResultList = null;
   public void combinations(int[] inpArr){

        for(int i=0;i<inpArr.length;i++){
            if(resultList.isEmpty()){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(inpArr[i]);
                resultList.add(list);
                tempResultList = new ArrayList<>(resultList);
            }else{
                ArrayList<Integer> currVal = new ArrayList<>();
                for (ArrayList<Integer> tempList: tempResultList){
                    ArrayList<Integer> allVals = new ArrayList<>();
                    for (Integer val:tempList){
                        allVals.add(val);
                    }
                    allVals.add(inpArr[i]);
                    resultList.add(allVals);
                }
                currVal.add(inpArr[i]);
                resultList.add(currVal);
                tempResultList = new ArrayList<>(resultList);
            }
        }
    }*/

    /*public List<Paranthesis> createParan(int n){
        List<Paranthesis> paranList = new ArrayList<>();
        for (int i=0;i<n;i++){
            paranList.add(new Paranthesis());
        }
        createParanStrings(paranList);
        return paranList;
    }

    public void createParanStrings(List<Paranthesis> paranList, Paranthesis prevParan, int index){
        if(paranList.size() == 1){
            return;
        }
        if(resultSet.contains(paranListToString(paranList))){
            return;
        }

        Paranthesis currParan = paranList.get(index);
        paranList.remove(index);
    }

    *//*public List<Paranthesis> addParans(List<Paranthesis> paranList, Paranthesis currParan){
        Paranthesis lastParan = paranList.get(paranList.size()-1);
        if(!lastParan.paranthesesList.isEmpty()){
            addParans(lastParan.paranthesesList,currParan);
        }
        //to add parans to side
        List<Paranthesis> tempParanList = new ArrayList<>(paranList);
        tempParanList.add(currParan);
        String currParanString = paranListToString(tempParanList);
        resultSet.add(currParanString);

        //to add parans inside

    }*//*

    public String paranListToString(List<Paranthesis> paranList){
        StringBuilder sb = new StringBuilder();
        for (Paranthesis paran:paranList){
            sb.append(paran.getParanString());
        }
        resultSet.add(sb.toString());
        return sb.toString();
    }*/

    public Set<String> generateParans(int remaining){
        Set<String> set = new HashSet<>();
        if(remaining==0){
            set.add("");
        }else{
            Set<String> prev = generateParans(remaining-1);
            for(String str:prev){
                for (int i=0;i < str.length();i++){
                    if(str.charAt(i) == '('){
                        String s = insertInside(str,i);
                        set.add(s);
                    }
                }
                set.add("()" + str);
            }
        }
        return set;
    }

    public String insertInside(String str, int leftIndex){
        String left = str.substring(0,leftIndex+1);
        String right = str.substring(leftIndex+1, str.length());
        return left + "()" + right;
    }

    public static void main(String[] args) {
        Set<String> result = new Parans().generateParans(3);
        for (String str: result){
            System.out.println(str);
        }
    }
}

/*class Paranthesis{
    Character open = '(';
    Character close = ')';
    List<Paranthesis> paranthesesList = null;

    public Paranthesis(){
        paranthesesList = new ArrayList<>();
    }

    public Paranthesis(int num){
        paranthesesList = new ArrayList<>();
        for(int i=1;i<num;i++){
            paranthesesList.add(new Paranthesis());
        }
    }
    public String getParanString(){
        StringBuilder paran = new StringBuilder();
        paran.append(open);
        paran.append(getParanString(paranthesesList));
        paran.append(close);
        return paran.toString();
    }

    public String getParanString(List<Paranthesis> paranthesesList){
        if(paranthesesList == null){
            return new String();
        }
        StringBuilder paranString = new StringBuilder();
        for(Paranthesis paran: paranthesesList){
            StringBuilder paranSB = new StringBuilder();
            paranSB.append(paran.open);
            paranSB.append(getParanString(paran.paranthesesList));
            paranSB.append(paran.close);
            paranString.append(paranSB);
        }
        return paranString.toString();
    }
}*/
