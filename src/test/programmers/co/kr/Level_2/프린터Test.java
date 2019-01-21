package programmers.co.kr.Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 프린터Test {

    @Test
    public void solution() {
        프린터 resolve = new 프린터();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        assertEquals(resolve.solution(priorities, location), 5);
    }
}