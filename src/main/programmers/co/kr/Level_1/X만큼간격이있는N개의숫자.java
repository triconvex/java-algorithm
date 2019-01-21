package programmers.co.kr.Level_1;

public class X만큼간격이있는N개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }


    //x = 10000000, n = 1000 인 경우에 아래의 로직은 위처럼 형변환 필요없다.
    public long[] 참고할만한_풀이(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
}
