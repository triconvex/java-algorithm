package programmers.co.kr.Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 위장Test {

    @Test
    public void solution() {
        위장 resolve = new 위장();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        assertEquals(resolve.참고할만한_풀이(clothes), 5);
    }
}