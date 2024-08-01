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

public class DesignerPDFViewer {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        PriorityQueue<Integer> prq = new PriorityQueue<>((x,y) -> y-x);
        for(int i = 0; i < word.length(); i++) {
            int c = ((int) word.charAt(i)) - 97;
            prq.add(h.get(c));
        }
        return word.length() * prq.poll();
    }

    public static void main(String[] args) throws IOException {
        List<Integer> h = new ArrayList<Integer>();
        String word;

        h.addAll(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
        word = "abc";
        System.out.println(designerPdfViewer(h, word));

        h.clear();
        h.addAll(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7));
        word = "zaba";

        System.out.println(designerPdfViewer(h, word));
    }
}