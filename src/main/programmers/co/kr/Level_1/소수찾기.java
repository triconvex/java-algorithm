package programmers.co.kr.Level_1;

public class 소수찾기 {
    //TODO : 효율성 증대방법 찾기
    public int solution(int n) {
        if(n == 2) {
            return 1;
        }

        int answer = 1;

        for (int i = 3; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }
}
