package programmers.co.kr.Level_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class 땅따먹기 {

    //TODO 오답!!!


    int solution(int[][] land) {
        int answer = 0;
        int lastIndex = -1;

        for (int[] ints : land) {
            int max = 0;
            int maxIndex = 0;

            for (int i = 0; i < ints.length; i++) {
                if(i != lastIndex && max < ints[i]) {
                    max = ints[i];
                    maxIndex = i;
                }
            }

            lastIndex = maxIndex;
            answer += max;
        }

        return answer;
    }

    @Test
    private void test() {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int answer = 16;

        Assert.assertEquals(solution(land), answer);
    }
}
