import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSummandsTest {
    public final int tests[][] = {
        null,
        {},
        { 10, 3, 5, 2, 9, 22, 1 },
        { 5, 2, 7, -2, -4, 8, 6 },
        { 10, 20, 30, 40, 50, 50 }
    };
    public final int sums[] = { 0, 0, 4, 5, 100 };
    public final ArrayList<HashSet<Integer>> solutions = makeSolutions();

    @Test public void testSolution() {
        for (int i = 0; i < tests.length; i++) {
            String msg = String.format("TwoSummands.solution should return %s", solutions.get(i).toString());
            assertEquals(msg, solutions.get(i), TwoSummands.solution(tests[i], sums[i]));
        }
    }

    private ArrayList<HashSet<Integer>> makeSolutions() {
        int solutions[][] = {
            {},
            {},
            { 3, 1 },
            { -2, 7 },
            { 50, 50 }
        };
        ArrayList<HashSet<Integer>> result = new ArrayList<>();
        for (int i = 0; i < solutions.length; i++) {
            HashSet<Integer> h = new HashSet<>();
            for (int j = 0; j < solutions[i].length; j++) {
                h.add(solutions[i][j]);
            }
            result.add(h);
        }
        return result;
    }

}