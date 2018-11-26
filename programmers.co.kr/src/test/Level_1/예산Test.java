package Level_1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class 예산Test {
    @Test
    public void testOne() {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int answer = 0;

        for (int i : Arrays.stream(d).sorted().toArray()) {
            if(budget - i >= 0) {
                budget -= i;
                answer++;
            }
        }
        assertEquals(answer, 3);
    }

    @Test
    public void testTwo() {
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = 0;

        for (int i : Arrays.stream(d).sorted().toArray()) {
            if(budget - i >= 0) {
                budget -= i;
                answer++;
            }
        }
        assertEquals(answer, 4);
    }
}