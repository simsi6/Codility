
public class FrogRiverOne {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/4-counting_elements/frog_river_one/
	 */
	public int solution(int X, int[] A) {
        // write your code in Java SE 8
		int[] flags = new int[X+1];
		
		int leafCount = 0;
		for(int i=0 ; i<A.length ; i++) {
			if(flags[A[i]] == 0) {
				flags[A[i]] = 1;
				leafCount++;
				
				if(leafCount == X) {
					return i;
				}
			}
		}
		
		return -1;
    }
}
