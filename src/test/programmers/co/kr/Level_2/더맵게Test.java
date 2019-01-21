package programmers.co.kr.Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 더맵게Test {

    @Test
    public void solution() {
        더맵게 resolve = new 더맵게();
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;
        assertEquals(resolve.solution(scoville, k), 2);
    }
}