package google1;
class FruitToBaskets{
	/*public int totalFruit(int[] tree) {
		int istrt = -1;int jstrt = -1;
        int ival=-1;
        int jval=-1;
        int icnt = 0;
        int jcnt = 0;
        int totalcnt = 0;
        int prevtotalcnt = 0;
        int preval = 0;
        int precnt = 0;
        if(tree.length == 1 || tree.length == 2) return tree.length;
        //[1,0,1,4,1,4,1,2,3]
        //[3,3,1,1,2]
        //[3,3,1,2]
        for(int k=0;k<tree.length;k++){
            if(ival == -1){
                ival = tree[k];
                icnt++;
                istrt = k;
                continue;
            }
            
            if(tree[k] == ival){
                icnt++;
                istrt = k;
            }else if(tree[k] == jval){
                jcnt++;
                jstrt = k;
            }else if(jval == -1){
                jval = tree[k];
                jcnt++;
            }else{
                prevtotalcnt = Math.max(prevtotalcnt,totalcnt);
                icnt = (preval==tree[k])?jcnt:1;
                ival = preval;
                //icnt = jcnt;ival = jval;jval = tree[k];jcnt = 1; 
            }
            preval = tree[k];
            totalcnt = icnt+jcnt;
        }
        return Math.max(prevtotalcnt,totalcnt);
    }
*/
    
	public int totalFruit(int[] tree) {
		return totalFruit(tree, 0, -1, -1, 0, -1);
	}
	
	public int totalFruit(int[] tree, int strt, int ival, int jval, int prevtotalcnt, int preval) {
        int icnt = 0; 
        int jcnt = 0;
        int totalcnt = 0;
        int precnt = 0;
        if(tree.length == 1 || tree.length == 2) return tree.length;
        //[1,0,0,0,1,0,4,0,4]
        //[1,0,1,4,1,4,1,2,3]
        //[3,3,1,1,2]
        //[3,3,1,2]
        for(int k=strt;k<tree.length;k++){
            if(ival == -1){
                ival = tree[k];
                icnt++;
                preval = tree[k];
                continue;
            }
            
            if(tree[k] == ival){
                icnt++;
            }else if(tree[k] == jval){
                jcnt++;
            }else if(jval == -1){
                jval = tree[k];
                jcnt++;
            }else{
                prevtotalcnt = Math.max(prevtotalcnt,totalcnt);
                totalcnt = totalFruit(tree,strt,-1,-1,prevtotalcnt,preval);
                break;
            }
            if (preval != tree[k]) strt = k; 
            preval = tree[k];
            totalcnt = icnt+jcnt;
        }
        return Math.max(prevtotalcnt,totalcnt);
    }

	public static void main(String...args){
    	int[] tree = {1,0,1,4,1,4,1,2,3};
    	System.out.println(new FruitToBaskets().totalFruit(tree));
    }
}