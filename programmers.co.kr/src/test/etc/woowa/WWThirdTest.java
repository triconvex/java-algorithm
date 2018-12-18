package etc.woowa;

import org.junit.Test;

import static org.junit.Assert.*;

public class WWThirdTest {

    @Test
    public void solution() {
        int[] A = {60, 80, 40, 40};
        int[] B = {1, 2, 1, 2};
        int M = 3;
        int X = 2;
        int Y = 100;

        WWThird resolve = new WWThird();

        assertEquals(resolve.solution(A,B,M,X,Y), 7);
    }
}