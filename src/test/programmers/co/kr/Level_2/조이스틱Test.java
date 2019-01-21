package programmers.co.kr.Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 조이스틱Test {

    @Test
    public void solution() {
        조이스틱 resolve = new 조이스틱();
        String name = "JEROEN";
        assertEquals(resolve.solution(name), 56);
    }
}