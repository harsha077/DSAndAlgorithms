class Coins{
	
/*Given Infinite coins 25 Cents, 10 cents, 5 cents and 1 cent. Find the number of ways 
to represent n cents.
*/

public int coin = 0;

// 25*a + 10*b + 5*c + 1*d
// My Solution to get just count, Iterative Solution, Runtime:
/*public int countCoins(int n){
	int[] coinArr = {25,10,5,1};
	int count = 0;
	for(int i=0;i<coinArr.length;i++){
		count = count + helper(i,coinArr,0,n);
	}
	return count;
}


public int helper(int mCoinInd,int[] coinArr, int count, int n){
	int currCount = 0;
	int mCoin = coinArr[mCoinInd];
	int coinCount = n/mCoin;
	int maxCoinVal = mCoin * coinCount;
	int rem = ((mCoinInd!=coinArr.length-1)?n - maxCoinVal:maxCoinVal);

	while(maxCoinVal>0){
		currCount = currCount + getCount(mCoinInd,coinArr,rem,count,n);
		coinCount = coinCount-1;
		maxCoinVal = mCoin * coinCount;
		rem = n - maxCoinVal;
	}
	count = count + currCount;
	return count;
}

public int getCount(int mCoinInd, int[] coinArr, int rem, int count, int n){
	if(rem == n) return count+1;
	int currCount = 0;
	int len = coinArr.length-1;
	int currCoinInd = mCoinInd;
	while(currCoinInd < len){
		currCoinInd = ((mCoinInd<coinArr.length-1)?currCoinInd + 1:currCoinInd);
		int currCoin = coinArr[currCoinInd];
		int tempRem = rem%currCoin;
		if(rem >= currCoin && tempRem == 0){
			count = count+1;
		}
	}
	
	count = count + currCount;
	return count;
}*/

// My solution - Recirsive.
public int countCoins(int n){
	int[] coinArr = {25,10,5,1};
	int count = 0;
	for(int i=0;i<coinArr.length;i++){
		count = count + helper(i,coinArr,0,0,n);
	}
	return count;
}


public int helper(int mCoinInd,int[] coinArr, int rem, int count, int n){
	if(rem == n) return count+1;
	int len = coinArr.length-1;
	int currCoinInd = mCoinInd;

	int currCount = 0;
	int mCoin = coinArr[mCoinInd];
	int coinCount = n/mCoin;
	int maxCoinVal = mCoin * coinCount;
	int rem = ((mCoinInd!=coinArr.length-1)?n - maxCoinVal:maxCoinVal);

	while(maxCoinVal>0){
		while(currCoinInd < len){
			currCoinInd = ((mCoinInd<coinArr.length-1)?currCoinInd + 1:currCoinInd);
			int currCoin = coinArr[currCoinInd];
			int tempRem = rem%currCoin;
			if(rem >= currCoin && tempRem == 0){
				count = count+1;
			}
		}
		currCount = currCount + helper(mCoinInd,coinArr,rem,count,n);
		coinCount = coinCount-1;
		maxCoinVal = mCoin * coinCount;
		rem = n - maxCoinVal;
	}
	count = count + currCount;
	return count;
}

/*public int getCount(int mCoinInd, int[] coinArr, int rem, int count, int n){
	if(rem == n) return count+1;
	int currCount = 0;
	int len = coinArr.length-1;
	int currCoinInd = mCoinInd;
	while(currCoinInd < len){
		currCoinInd = ((mCoinInd<coinArr.length-1)?currCoinInd + 1:currCoinInd);
		int currCoin = coinArr[currCoinInd];
		int tempRem = rem%currCoin;
		if(rem >= currCoin && tempRem == 0){
			count = count+1;
		}
	}
	
	count = count + currCount;
	return count;
}*/


public static void main(String...args){
	//System.out.println(77%25);
	int currency = 77;
	System.out.println(new Coins().countCoins(currency));
	//System.out.println(27/25);
}

}