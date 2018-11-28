package Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 숫자야구Test {
    @Test
    public void testOne() {
        숫자야구 numberBaseball = new 숫자야구();
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        assertEquals(numberBaseball.solution(baseball), 2);
    }

}