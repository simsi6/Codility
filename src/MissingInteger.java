public class MissingInteger {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/4-counting_elements/missing_integer/
	 */
	public int solution(int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		int[] flags = new int[size+1];
		
		for(int a : A) {
			if(a >= 1 && a <= size) {
				flags[a] = 1;
			}
		}
		
		for(int i=1 ; i<flags.length ; i++) {
			if(flags[i] == 0) {
				return i;
			}
		}
		
		return flags.length;
    }
}
