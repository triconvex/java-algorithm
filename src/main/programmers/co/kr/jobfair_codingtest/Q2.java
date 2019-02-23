package programmers.co.kr.jobfair_codingtest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.testng.AssertJUnit.assertEquals;

public class Q2 {
    public int solution(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);

        LinkedList<Integer> men = new LinkedList<>();
        for (int person : people) {
            men.add(person);
        }

        LinkedList<Integer> shirts = new LinkedList<>();
        for (int tshirt : tshirts) {
            shirts.add(tshirt);
        }


        int answer = 0;

        for (int person : men) {
            while(shirts.size() != 0 && person > shirts.getFirst()) {
                shirts.removeFirst();
            }

            if(shirts.size() == 0) {
                return answer;
            }

            answer++;
            shirts.removeFirst();
        }

        return answer;
    }

    @Test
    public void test() {
        int[] people = {1,2,3};
        int[] tshirts = {1,1};
        assertEquals(solution(people, tshirts), 1);
    }

    @Test
    public void test2() {
        int[] people = {1,2,3,4,5};
        int[] tshirts = {1,1,2,3};
        assertEquals(solution(people, tshirts), 3);
    }
}
