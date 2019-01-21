package programmers.co.kr.Level_1;

import org.junit.Test;

import static org.junit.Assert.assertThat;


public class K번째수Test {

    @Test
    public void solution() {
        K번째수 resolve = new K번째수();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] answer = {5,6,3};

        for (int i : answer) {
            System.out.println(i);
        }

        for (int i : resolve.solution(array, commands)) {
            System.out.println(i);
        }
    }
}