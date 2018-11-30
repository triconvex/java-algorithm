package Level_1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        return (a > b ? sum(a, b) : sum(b, a));
    }

    public long sum(long max, long min) {
        long result = 0;
        for (long i = min; i <= max; i++) {
            result += i;
        }
        return result;
    }


    //Math클래스 활용, sum 공식
    public long 참고할만한_풀이(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
