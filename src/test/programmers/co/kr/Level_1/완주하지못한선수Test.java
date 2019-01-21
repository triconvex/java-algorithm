package programmers.co.kr.Level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class 완주하지못한선수Test {
    @Test
    public void testOne() {
        완주하지못한선수 resolve = new 완주하지못한선수();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        assertEquals(resolve.solution(participant, completion), "leo");
    }

    @Test
    public void testTwo() {
        완주하지못한선수 resolve = new 완주하지못한선수();
        String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav", "stanko"};
        String[] completion = {"stanko", "mislav", "ana", "mislav", "mislav"};

        assertEquals(resolve.참고할만한_풀이(participant, completion), "stanko");
    }
}