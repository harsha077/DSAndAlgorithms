package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class FlipToWin {

	public static void main(String[] args) {
		System.out.println(flipToWin(53));
	}
	
	public static int flipToWin(int n) {
		List<Integer> sequence = countBits(n);
		return findMaxOneSeqLength(sequence);
	}
	
	public static List<Integer> countBits(int n) {
		List<Integer> sequence = new ArrayList<Integer>();
		int counter = 0;
		int subSeq = 0;
		for(int i=0;i < Integer.BYTES * 8;i++) {
			if((n&1)!=subSeq) {
				sequence.add(counter);
				subSeq = n & 1;
				counter = 0;
			}
			counter++;
			n >>>= 1;
		}
		sequence.add(counter);
		return sequence;
	}
	
	public static int findMaxOneSeqLength(List<Integer> sequence) {
		int maxSeq = 0;
		for(int i=0;i < sequence.size(); i+=2) {
			int zeroth = sequence.get(i);
			int oneleftval = i-1 >= 0 ? sequence.get(i-1): 0;
			int onerightval = i+1 < sequence.size() ? sequence.get(i+1): 0;
			int thisSeq = 0;
			if(zeroth == 1) {
				thisSeq = oneleftval + 1 + onerightval;
			}else if(zeroth > 1) {
				thisSeq = 1 + Math.max(oneleftval, oneleftval);
			}else if(zeroth == 0) {
				thisSeq = Math.max(oneleftval, oneleftval);
			}
			
			maxSeq = Math.max(thisSeq, maxSeq);
		}
		return maxSeq;
	}

}
