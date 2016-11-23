
public class CountDiv {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/5-prefix_sums/count_div/
	 */
	public int solution(int A, int B, int K) {
        return divisibleCount(B, K) - divisibleCount(A-1, K);
           
    }
    
    private int divisibleCount(int a, int k) {
    	if(a < 0) {
    		return 0;
    	}
    	
        return a/k + 1;
    }
}
