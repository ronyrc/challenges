import java.util.*;

public class PermMissingElem {

	 public static int solution(int[] A) {
	 	int n = A.length + 1;
	 	int somTotal = (n * (1 + n)) / 2;
	 	int somArray = Arrays.stream(A).sum();

	 	return somTotal - somArray;
	 }
	
	public static void main(String [] main) {
		int A[] = {2, 3, 1, 5};
		System.out.println(Arrays.toString(A) + " -> falta o " + solution(A));	
	}
}