
public class PermMissingElem {
	public int solution(int[] A) {
		/*
		 *  Task Description
		 *  https://codility.com/programmers/task/perm_missing_elem/
		 */
		long N = A.length;
		long sum = (N+1)*(N+2)/2;
		for(int elem : A) {
			sum -= elem;
		}
		return (int)sum;
    }
}
