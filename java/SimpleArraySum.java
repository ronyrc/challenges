import java.util.*;
import java.util.stream.*;

public class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0, (a, b) -> a + b);
    }
	
	public static void main(String[] args) {
		System.out.println(simpleArraySum(List.of(1, 2, 3, 4, 10, 11)));
	}
}