package DynamicP1;

public class RecursivlyMultiply {

    /*public int recMultiply(int origA,int origB, int a, int b){
        if(b == 1 && origB%2 == 0) return a;
        if(b == 1 && origB%2 == 1){
            a = a + origA;
            return  a;
        }

        b = b/2;
        a = a << 1;
        a = recMultiply(origA,origB,a,b);
        return a;
    }*/

    //Leetcode solution 1, O(n)
    /*public int recMultiply(int a, int b){

        int bigger = a < b ? b : a;
        int smaller = a < b ? a : b;

        return recMultiplyHelper(smaller,bigger);
    }

    //Leetcode solution 1, O(n)
    public int recMultiplyHelper(int smaller, int bigger){
        if(smaller == 0){
            return 0;
        }else if(smaller == 1){
            return bigger;
        }

        int s = smaller >> 1;
        int side1 = recMultiply(s,bigger);
        int side2 = side1;
        if(smaller%2 == 1){
            side2 = recMultiplyHelper(smaller - s, bigger);
        }

        return side1+side2;
    }*/

    //Leetcode solution 2, Memoization O(log n)
    public int recMultiply(int a, int b){

        int bigger = a < b ? b : a;
        int smaller = a < b ? a : b;

        int[] memo = new int[smaller+1];
        return recMultiplyHelper(smaller,bigger,memo);
    }

    //Leetcode solution 2, Memoization O(log n)
    public int recMultiplyHelper(int smaller, int bigger,int[] memo){
        if(smaller == 0){
            return 0;
        }else if(smaller == 1){
            return bigger;
        }else if(memo[smaller] > 0){
            return memo[smaller];
        }

        int s = smaller >> 1;
        int side1 = recMultiply(s,bigger);
        int side2 = side1;
        if(smaller%2 == 1){
            side2 = recMultiplyHelper(smaller - s, bigger,memo);
        }

        memo[smaller] = side1+side2;
        return memo[smaller];
    }

    public static void main(String[] args) {
        int a = 5,b = 3;
        int c = new RecursivlyMultiply().recMultiply(a,b);
        System.out.println(c);
        /*int d = 3;
        System.out.println(d%2);*/
    }
}
