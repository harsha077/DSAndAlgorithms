package RecursionAndDynamicP;

import java.util.Arrays;

/**This problem is from UDEMY**/
public class Dearangements {
    int n;
    long[] subSolutionArr = null;
    public Dearangements(){ }
    public Dearangements(int n){
        this.n = n;
        this.subSolutionArr = new long[n+1];
        Arrays.fill(subSolutionArr,-1);
    }

    public long countDearangements(){
        //return countDearangementsTopBottom(n);
        return countDearangementsBottomUp(n);
    }

    /**
     * Regular recursion
     * @param n
     * @return
     */
    /*private long countDearangementsTopBottom(int n){
        if(n==1) {
           return 0;
        } else if(n==2) {
            return 1;
        } else {
            return (n-1)*(countDearangementsTopBottom(n-1)+countDearangementsTopBottom(n-2));
        }
    }*/

    /**
     * Dynamic programming with top down approach
     * @param args
     */
    /*private long countDearangementsTopBottom(int n){
        if(subSolutionArr[n] != -1) return subSolutionArr[n];
        if(n==1) {
            subSolutionArr[n] = 0;
        } else if(n==2) {
            subSolutionArr[n] = 1;
        } else {
            subSolutionArr[n] = (n-1)*(countDearangementsTopBottom(n-1)+countDearangementsTopBottom(n-2));
        }
        return subSolutionArr[n];
    }*/

    /**
     * Dynamic programming with bottom up approach
     * @param n
     * @return
     */
    private long countDearangementsBottomUp(int n){
        long nMinus1=1;
        long nMinus2=0;
        long currentValue=0;
        for(int i=1;i<=n;i++) {
            currentValue = (i - 1) * (nMinus1 + nMinus2);
            nMinus2 = nMinus1;
            nMinus1 = currentValue;
        }
        return currentValue;
    }

    public static void main(String[] args) {
        System.out.println(new Dearangements(4).countDearangements());
    }
}
