public class PermCheck {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/4-counting_elements/perm_check/
	 */
	private static final int PERMUTATION = 1;
	private static final int NOT = 0;
	
	public int solution(int[] A) {
		int[] flags = new int[A.length+1];
		
		int length = A.length;
		for(int i=0 ; i<length ; i++) {
			int elem = A[i];
			if(elem > length) {
				return NOT;
			}
			
			if(flags[elem] == 0) {
				flags[elem] = 1;
			} else {
				return NOT;
			}
		}
		
		return PERMUTATION;
    }
}
