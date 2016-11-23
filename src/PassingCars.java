
public class PassingCars {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/lessons/5-prefix_sums/passing_cars/
	 */
	public int solution(int[] A) {
        int sum = 0;
        int temp = 0;
        for(int i=A.length-1 ; i>=0 ; i--) {
            if(A[i] == 1) {
                temp++;   
            } else {
                sum += temp;
                if(sum > 1000000000) {
                    return -1;
                }
            }
        }
        
        return sum;
    }
}
