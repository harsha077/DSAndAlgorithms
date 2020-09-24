package DynamicP1;

import java.net.Inet4Address;
import java.util.Stack;

public class TowersOfHanoi {

    static Stack<Integer> tower1 = null;
    static Stack<Integer> tower2 = null;
    static Stack<Integer> tower3 = null;
    static Integer numOfDiscs = null;
    static Integer count = null;

    public TowersOfHanoi(int numOfDiscs){
        this.numOfDiscs = numOfDiscs;
        count = 0;
        tower1 = new Stack<Integer>();
        tower2 = new Stack<Integer>();
        tower3 = new Stack<Integer>();
        for(int i=numOfDiscs;i>=1;i--){
            tower1.push(i);
        }
     //   System.out.println(tower1.size());
    }

    //My Solution Iterative,
    /*public void moveDiscs(){
        Integer lastMoved = null;
        while(tower2.size() <= numOfDiscs){
            if(tower2.size() == numOfDiscs || tower3.size() == numOfDiscs) return;
            //Tower 1
            if (!tower1.isEmpty() && tower1.peek() != lastMoved){
               if(tower2.isEmpty() || tower1.peek() < tower2.peek()){
                   lastMoved = tower1.peek();
                   tower2.push(tower1.pop());
                   count++;
               }
                if(!tower1.isEmpty() && (tower3.isEmpty() || tower1.peek() < tower3.peek())){
                    lastMoved = tower1.peek();
                    tower3.push(tower1.pop());
                    count++;
                }
            }
            //Tower 2
            if (!tower2.isEmpty() && tower2.peek() != lastMoved){
                if(tower3.isEmpty() || tower2.peek() < tower3.peek()){
                    lastMoved = tower2.peek();
                    tower3.push(tower2.pop());
                    count++;
                }
                if(!tower2.isEmpty() && (tower1.isEmpty() || tower2.peek() < tower1.peek())){
                    lastMoved = tower2.peek();
                    tower1.push(tower2.pop());
                    count++;
                }
            }
            //Tower 3
            if (!tower3.isEmpty() && tower3.peek() != lastMoved){
                if(tower1.isEmpty() || tower3.peek() < tower1.peek()){
                    lastMoved = tower3.peek();
                    tower1.push(tower3.pop());
                    count++;
                }
                if(!tower3.isEmpty() && (tower2.isEmpty() || tower3.peek() < tower2.peek())){
                    lastMoved = tower3.peek();
                    tower2.push(tower3.pop());
                    count++;
                }
            }

        }
    }*/

    // My Solution
    public void moveDiscs(){

    }
    public static void main(String[] args) {
        new TowersOfHanoi(7).moveDiscs();
        /*while(!tower3.isEmpty()){
            System.out.println(tower3.pop());
        }
        while(!tower2.isEmpty()){
            System.out.println(tower2.pop());
        }*/
        System.out.println(count);
    }
}
