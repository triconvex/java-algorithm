package Level_1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int gcd = 1;
        int lcm = Math.max(n, m);

        for (int i = 1; i <= Math.min(n, m); i++) {
            if((double)n % i == 0 && (double)m % i == 0) {
                gcd = i;
            }
        }

        while (lcm % n != 0 || lcm % m != 0) {
            lcm++;
        }

        return new int[]{gcd, lcm};
    }

    //참고할만한_풀이
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}
