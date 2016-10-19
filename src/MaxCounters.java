import java.util.*;

public class MaxCounters {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/4-counting_elements/max_counters/
	 */
	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int[] result = new int[N];
        
        int max = 0;
        for(int a : A) {
            if(a == (N+1)) {
            	if(max > 0) {
	                Arrays.fill(result, max);
	                max = 0;
            	}
            } else {
                result[a-1]++;
                if(result[a-1] > max) {
                	max = result[a-1];
                }
            }
        }
        return result;
	}
}
