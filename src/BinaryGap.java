
public class BinaryGap {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/task/binary_gap/
	 */
	public int solution(int N) {
		boolean boundary = false;
		int gap = 0;
		int maxGap = 0;
		String binary = Integer.toBinaryString(N);
		for(char ch : binary.toCharArray()) {
			if(ch == '1') {
				if(boundary) {
					if(maxGap < gap) {
						maxGap = gap;
					}
					gap = 0;
				} else {
					boundary = true;
				}
			} else {
				if(boundary) {
					gap++;
				}
			}
		}
		return maxGap;
	}
}
