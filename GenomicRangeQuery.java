import java.util.*;

public class GenomicRangeQuery {

	 public static int[] solution(String S, int[] P, int[] Q) {
	 	int[] query = new int[P.length];
	 	Map<Character, Integer> n = new HashMap<Character, Integer>();
	 	n.put('A', 1);
	 	n.put('C', 2);
	 	n.put('G', 3);
	 	n.put('T', 4);
	 	int fator;

	 	 for(int i = 0; i < P.length; i++) {
	 		String s = S.substring(P[i], Q[i]+1);
	 		fator = n.get(s.charAt(0));
	 		for(int j = 0; j < s.length(); j++){
	 			if (fator > n.get(s.charAt(j))) fator = n.get(s.charAt(j)); 
	 		}
	 		query[i] = fator; 
	 	} 
	 	return query;
	 }
	
	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0}, Q = {4, 5, 6};
		System.out.println(Arrays.toString(solution(S, P, Q)));
	}

}