
public class CyclicRotation {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
	 */
	public int[] solution(int[] A, int K) {
		int N = A.length;
		if(N <= 1 || K == 0) {
			return A;
		}
		
		int shift = K % N;
		if(shift == 0) {
			return A;
		}
		
		int pivot = N - shift;
		int[] result = new int[N];
		for(int i = 0 ; i<shift ; i++) {
			result[i] = A[pivot+i];
		}
		for(int i=shift ; i<N ; i++) {
			result[i] = A[i-shift];
		}
		
		return result;
    }
}
