package programmers.co.kr.Level_1;

import java.util.stream.IntStream;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }


    public int 참고할만한_풀이(int n) {
        int answer = 0;

        for (int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }


    //성능은 별로
    public int 참고할만한_풀이2(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).sum();
    }
}
