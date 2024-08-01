import java.util.*;
import java.util.stream.*;

public class OddOccurrenciesInArray {

	public static int solution(int[] A) {
		Map<Integer, Integer> ht = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++ ) {

			if (ht.containsKey(A[i])) {
				ht.put(A[i], ht.get(A[i]) + 1);
			} else {
				ht.put(A[i], 1);
			}
		}

		return ht.entrySet().stream().filter(m -> (m.getValue() % 2) != 0)
			.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()))
			.entrySet().iterator().next().getKey();
	}
	
	public static void main(String[] arg) {
		int[] myArray = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(myArray));
	}
}