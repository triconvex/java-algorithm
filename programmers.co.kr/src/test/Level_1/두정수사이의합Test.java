package Level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class 두정수사이의합Test {

    @Test
    public void solution() {
        두정수사이의합 resolve = new 두정수사이의합();
        int a = 3;
        int b = 5;

        assertEquals(resolve.solution(a,b), 12);
    }
}