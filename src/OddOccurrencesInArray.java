
public class OddOccurrencesInArray {
	public int solution(int[] A) {
		/*
		 *  Task Description
		 *  https://codility.com/programmers/task/odd_occurrences_in_array/
		 */
		for(int i=0 ; i<A.length-1 ; i++) {
			A[i+1] ^= A[i];
		}
		return A[A.length-1];
    }
}
