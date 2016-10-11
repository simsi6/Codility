
public class PermMissingElem {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/task/perm_missing_elem/
	 */
	public int solution(int[] A) {
		long N = A.length;
		long sum = (N+1)*(N+2)/2;
		for(int elem : A) {
			sum -= elem;
		}
		return (int)sum;
    }
}
