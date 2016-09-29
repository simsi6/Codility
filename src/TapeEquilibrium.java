
public class TapeEquilibrium {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/task/tape_equilibrium/
	 */
	public int solution(int[] A) {
        // write your code in Java SE 8
		int arrLength = A.length;
		int sum[] = new int[arrLength];
		sum[0] = A[0];
		for(int i=1 ; i<arrLength ; i++) {
			sum[i] = sum[i-1] + A[i];
		}
		
		int totalSum = sum[arrLength-1];
		int minDiff = Math.abs(totalSum - (2 * sum[0]));
		for(int p=2 ; p<arrLength ; p++) {
			sum[p-1] = Math.abs(totalSum - (2 * sum[p-1]));
			if(sum[p-1] < minDiff) {
				minDiff = sum[p-1];
			}
		}
				
		return minDiff;
    }
}
