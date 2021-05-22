public class BinaryGap {
	public static int solution(int N) {
		String intAsBinary = Integer.toBinaryString(N);
		int longestSeq = 0;
		int longestSeqAux = 0;

		for (int i = 0; i < intAsBinary.length(); i++) {
			if (intAsBinary.charAt(i) == '0') {
				longestSeqAux += 1;
			} else {
				if (longestSeqAux > longestSeq) { 
					longestSeq = longestSeqAux;
				}
				longestSeqAux = 0;
			}
		}
		return longestSeq;
	}

	public static void main(String arg[]) {
		System.out.println(solution(9) + " // " + Integer.toBinaryString(9)); // 2 // 1001
		System.out.println(solution(529) + " // " + Integer.toBinaryString(529)); // 4 // 1000010001
		System.out.println(solution(20) + " // " + Integer.toBinaryString(20)); // 1 // 10100
		System.out.println(solution(15) + " // " + Integer.toBinaryString(15)); // 0 // 1111
		System.out.println(solution(32) + " // " + Integer.toBinaryString(32)); // 0 // 100000
		System.out.println(solution(1041) + " // " + Integer.toBinaryString(1041)); // 5 // 10000010001
	}
}