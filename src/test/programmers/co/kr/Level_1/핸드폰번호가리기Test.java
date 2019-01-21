package programmers.co.kr.Level_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class 핸드폰번호가리기Test {

    @Test
    public void solution() {
        핸드폰번호가리기 resolve = new 핸드폰번호가리기();
        String phone_number = "01033334444";
        String answer = "*******4444";
        assertEquals(resolve.solution(phone_number), answer);
    }
}