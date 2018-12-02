package Level_1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class 같은숫자는싫어Test {

    @Test
    public void solution() {
        같은숫자는싫어 resolve = new 같은숫자는싫어();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {1,3,0,1};

        assertArrayEquals(resolve.solution(arr), answer);
    }
}