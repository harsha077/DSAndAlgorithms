package RecursionAndDynamicP;

import java.util.Arrays;

public class AirCraftSpacing {
    int[] airCraftArr = null;
    int[] airCraftArrTemp = null;
    public AirCraftSpacing(int[] airCraftArr){
        this.airCraftArr = airCraftArr;
        this.airCraftArrTemp = new int[airCraftArr.length];
        Arrays.fill(airCraftArrTemp,-1);
    }
    public int getMaxPassengers(){
        return getMaxPassengers(0);
    }

    /**Recursive Solution**/
   /* public int getMaxPassengers(int n){
        if(airCraftArr == null || airCraftArr.length == 0) return 0;
        if(n >= airCraftArr.length) return 0;
        int currentNumber = airCraftArr[n] + getMaxPassengers(n+2);
        int nextNumber = getMaxPassengers(n+1);
        return Math.max(currentNumber,nextNumber);
    }*/

   /**Top Down Approach**/
    /*public int getMaxPassengers(int n){
        if(airCraftArr == null || airCraftArr.length == 0) return 0;
        if(n >= airCraftArr.length-1) return 0;
        if(airCraftArrTemp[n] != -1) return airCraftArrTemp[n];
        airCraftArrTemp[n] = airCraftArr[n] + getMaxPassengers(n+2);
        airCraftArrTemp[n+1] = getMaxPassengers(n+1);
        return Math.max(airCraftArrTemp[n],airCraftArrTemp[n+1]);
    }*/

    /*Bottom up solution - With Additional Variables*/
   int solutionI = 0;
   int solutionIPlusOne = 0;
   int solutionIPlusTwo = 0;
   /*public int getMaxPassengers(int n){
       if(airCraftArr == null || airCraftArr.length == 0) return 0;
       for(int i=airCraftArr.length-1;i>=0;i--) {
           solutionIPlusTwo = airCraftArr[i] + solutionIPlusTwo;
           solutionIPlusOne = solutionI;
           solutionI = Math.max(solutionIPlusOne,solutionIPlusTwo);
           solutionIPlusTwo = solutionIPlusOne;
       }
       return solutionI;
   }*/

    /**Bottom up Approach - With no additional variables - But original input array will be changed**/
   /*public int getMaxPassengers(int n){
      if(airCraftArr == null || airCraftArr.length == 0) return 0;
      int currentNum = 0;
      int nextNum = 0;
      for(int i=airCraftArr.length-1;i>=0;i--) {
          currentNum = airCraftArr[i] + ((i<=airCraftArr.length-3)?airCraftArr[i + 2]:0);
          nextNum = (i<=airCraftArr.length-2?airCraftArr[i + 1]:0);
          airCraftArr[i] = Math.max(currentNum,nextNum);
      }
      return airCraftArr[0];
   }*/

    /**Bottom up Approach - With no additional variables - Additional Array**/
    public int getMaxPassengers(int n){
      if(airCraftArr == null || airCraftArr.length == 0) return 0;
      int currentNum = 0;
      int nextNum = 0;
      for(int i=airCraftArr.length-1;i>=0;i--) {
          currentNum = airCraftArr[i] + ((i<=airCraftArrTemp.length-3)?airCraftArrTemp[i + 2]:0);
          nextNum = (i<=airCraftArrTemp.length-2)?airCraftArrTemp[i + 1]:0;
          airCraftArrTemp[i] = Math.max(currentNum,nextNum);
      }
      return airCraftArrTemp[0];
   }

    public static void main(String[] args) {
        int[] airCraftArr = {155,55,2,96,67,203,3};
        System.out.println(new AirCraftSpacing(airCraftArr).getMaxPassengers());
    }

}
