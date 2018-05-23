import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSummandsTest {
    public final HashSet<Integer> emptySet = new HashSet<>();

    @Test public void nullCase() {
        assertEquals("Solution should handle the null case", emptySet, TwoSummands.solution(null, 0));
    }

    @Test public void emptyArray() {
        assertEquals("Solution should handle an empty array", emptySet, TwoSummands.solution(null, 0));
    }

    @Test public void testCases() {
        int tests[][] = {
            { 10, 3, 5, 2, 9, 22, 1 },
            { 5, 2, 7, -2, -4, 8, 6 },
            { 10, 20, 30, 40, 50, 50 }
        };
        int sums[] = { 4, 5, 100 };
        ArrayList<HashSet<Integer>> solutions = makeSolutions();

        for (int i = 0; i < tests.length; i++) {
            HashSet<Integer> solution = TwoSummands.solution(tests[i], sums[i]);
            String msg = String.format("Solution should return %s, got %s", solutions.get(i), solution);
            assertEquals(msg, solutions.get(i), solution);
        }
    }

    private ArrayList<HashSet<Integer>> makeSolutions() {
        int solutions[][] = {
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