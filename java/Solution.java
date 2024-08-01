import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static int segment(int x, List<Integer> space) {
            PriorityQueue<Integer> prqMax = new PriorityQueue<>((a,b) -> b-a);            
            for (int i = 0; i <= space.size() - x; i++) {
                PriorityQueue<Integer> prqMin = new PriorityQueue<>();
                for( int j = 0; j < x ; j++) {
                    prqMin.add(space.get(i+j));
                }
                prqMax.add(prqMin.poll());
            }
            return prqMax.poll();
    }

    public static void main(String[] args) throws IOException {
        List<Integer> height = new ArrayList<Integer>();
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(6);
        height.add(8);

        int k = 3;

        int result = segment(k, height);

        System.out.println(result);

        List<Integer> h = new ArrayList<Integer>();
        h.add(1);
        h.add(1);
        h.add(1);

        System.out.println(segment(2, h));


    }
}
