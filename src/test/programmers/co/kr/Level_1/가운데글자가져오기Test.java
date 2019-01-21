package programmers.co.kr.Level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class 가운데글자가져오기Test {

    @Test
    public void solution() {
        가운데글자가져오기 resolve = new 가운데글자가져오기();
        String s = "abcde";

        assertEquals(resolve.solution(s), "c");
        assertEquals(resolve.참고할만한_풀이(s), "c");
    }
}