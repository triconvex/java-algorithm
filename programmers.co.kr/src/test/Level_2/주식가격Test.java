package Level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class 주식가격Test {

    @Test
    public void solution() {
        주식가격 resolve = new 주식가격();
        int[] prices = {498,501,470,489,520,520,520};
        int[] answer = {2,1,4,3,2,1,0};

        assertArrayEquals(resolve.solution(prices), answer);
    }
}