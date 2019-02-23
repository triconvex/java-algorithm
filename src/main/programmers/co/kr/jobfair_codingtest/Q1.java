package programmers.co.kr.jobfair_codingtest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Q1 {
    //TODO : 못품.. 주어진 수가 3개의 서로 다른 소수의 합으로 나오는 경우의 수..

    public int solution(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(prime(i) != 0) {
                primes.add(i);
            }
        }

        int answer = 0;

        for (int i = 0; i < primes.size(); i++) {
            int temp = n - primes.get(i);
            for (int j = i + 1; j < primes.size(); j++) {
                if(prime(temp - primes.get(j)) != 0) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    public int prime(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (num == i) {
                    return num;
                }

                return 0;
            }
        }

        return 0;
    }

    @Test
    public void test() {
        assertEquals(solution(33), 4);
    }
}
