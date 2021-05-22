import java.util.*;
import java.util.stream.*;

public class CyclicRotation {

	 public static int[] solution(int[] A, int K) {
	 	if (A.length == 0) return A;
	 	LinkedList<Integer> fila = new LinkedList<Integer>();
	 	fila.addAll(IntStream.of(A).boxed().collect(Collectors.toList()));

	 	for(int i = 0; i < K; i++) {
	 		fila.addFirst(fila.getLast());
	 		fila.removeLast();
	 	} 

	 	return fila.stream().mapToInt(i->i).toArray();
	 }
	
	public static void main(String[] args) {
		int K = 3, A[] = {3, 8, 9, 7, 6};
		System.out.println(Arrays.toString(A) + " -> " + K + " vezes -> " + Arrays.toString(solution(A, K)));	

		int L = 4, B[] = {1, 2, 3, 4};
    	System.out.println(Arrays.toString(B) + " -> " + L + " vezes -> " + Arrays.toString(solution(B, L)));	

    	int M = 1, C[] = {0, 0, 0};
    	System.out.println(Arrays.toString(C) + " -> " + M + " vezes -> " + Arrays.toString(solution(C, M)));	

	}
}