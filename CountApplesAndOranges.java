import java.util.*;
import java.util.stream.*;

public class CountApplesAndOranges {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s, starting point of Sam's house location. 
     *  2. INTEGER t, ending location of Sam's house location. 
     *  3. INTEGER a, location of the Apple tree. 
     *  4. INTEGER b, location of the Orange tree. 
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    	LinkedList<Integer> fallApples = new LinkedList<Integer>();
    	for( int apple : apples) {
    		if (a + apple >= s && a + apple <= t) fallApples.add(apple);
    	}

    	LinkedList<Integer> fallOranges = new LinkedList<Integer>();
    	for( int orange : oranges) {
    		if (b + orange >= s && b + orange <= t) fallOranges.add(orange);	
    	}

    	System.out.println(fallApples.size());
    	System.out.println(fallOranges.size());
    }
	
	public static void main(String[] args) {
		countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6) );
	}
}