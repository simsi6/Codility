
public class FrogJmp {
	/*
	 *  Task Description
	 *  https://codility.com/programmers/task/frog_jmp/
	 */
	public int solution(int X, int Y, int D) {
		return (int)Math.ceil((double)(Y-X)/D);
    }
}
