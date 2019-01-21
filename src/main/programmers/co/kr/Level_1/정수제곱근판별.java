package programmers.co.kr.Level_1;

public class 정수제곱근판별 {
    public long solution(long n) {
        double temp = Math.sqrt(n);
        return temp - (int)temp == 0 ? (long) Math.pow(temp + 1, 2) : -1;
    }


    public long 참고할만한_풀이(long n) {
        double temp = Math.sqrt(n);
        return Math.pow((int)temp, 2) == n ? (long) Math.pow(temp + 1, 2) : -1;
    }
}
