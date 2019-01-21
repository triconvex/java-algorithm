package programmers.co.kr.Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 라면공장Test {

    @Test
    public void solution() {
        라면공장 resolve = new 라면공장();
        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;

//        assertEquals(resolve.solution(stock, dates, supplies, k), 2);
        assertEquals(resolve.참고할만한_풀이(stock, dates, supplies, k), 2);
    }
}