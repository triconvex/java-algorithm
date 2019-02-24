package programmers.co.kr.jobfair_codingtest;

import org.junit.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class Q3 {
    public int[] solution(int[] healths, int[][] items) {
        Arrays.sort(healths);

        TreeMap<Integer, Integer> item = new TreeMap<>();
        for (int[] ints : items) {
            item.put(ints[0], ints[1]);
        }

        List<Integer> answer = new ArrayList<>();

        for (Integer currentHp : healths) {
            for (Integer risingAtk : item.descendingKeySet()) {
                if(currentHp - item.get(risingAtk) >= 100) {
                    answer.add(getIndex(items, risingAtk));
                    item.remove(risingAtk);
                    break;
                }
            }
        }

        Collections.sort(answer);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private int getIndex(int[][] items, int risingAtk) {
        for (int i = 0; i < items.length; i++) {
            if(items[i][0] == risingAtk) {
                return i + 1;
            }
        }

        return 0;
    }

    @Test
    public void test() {
        int[] healths = {200,120,150};
        int[][] item = {{30,100},{500,30},{100,400}};

        int[] answer = {1,2};

        assertEquals(solution(healths, item), answer);
    }
}
