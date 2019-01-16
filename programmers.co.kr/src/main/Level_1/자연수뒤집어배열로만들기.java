package Level_1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.valueOf(str[answer.length - 1 - i]);
        }

        return answer;
    }


    // 성능 근소하게 앞서는데 좋은 풀이일까?

    public int[] 참고할만한_풀이(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        int cnt=0;

        while(n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }
        return answer;
    }
}
