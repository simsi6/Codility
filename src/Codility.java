
public class Codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new BinaryGap().solution(1041));
		//System.out.println(new TapeEquilibrium().solution(new int[]{3,1,2,4,3}));
		//System.out.println(new FrogJmp().solution(10, 85, 30));
		//System.out.println(new PermMissingElem().solution(new int[]{2,3,1,5}));
		//System.out.println(new CyclicRotation().solution(new int[]{3,8,9,7,6}, 3));
		//System.out.println(new OddOccurrencesInArray().solution(new int[]{9,3,9,3,9,7,9}));
		//System.out.println(new PermCheck().solution(new int[]{1000000000, 1}));
		//System.out.println(new MissingInteger().solution(new int[]{1,3,6,4,1,2}));
		//System.out.println(new FrogRiverOne().solution(5, new int[]{1,3,1,4,2,3,5,4}));
		//System.out.println(arrayToString(new MaxCounters().solution(5, new int[]{3,4,4,6,1,4,4})));
		System.out.println(new PassingCars().solution(new int[]{0,1,0,1,1}));
	}
	
	private static String arrayToString(int[] arr) {
		String str = "{";
		for(int i=0 ; i<arr.length ; i++) {
			str += arr[i];
			str += (i < (arr.length-1)) ? "," : "";
		}
		str += "}";
		return str;
	}

}
