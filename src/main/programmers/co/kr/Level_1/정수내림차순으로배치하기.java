package programmers.co.kr.Level_1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            for (String num : str) {
                if (num.equals(String.valueOf(i))) {
                    sb.append(num);
                }
            }
        }

        return Long.valueOf(sb.toString());
    }

    //참고할만한_풀이
    //코드짧지만 성능이 매우 별로

    String res = "";

    public long 참고할만한_풀이(long n) {
        Long.toString(n).chars().sorted().forEach(c -> res = (char) c + res);
        return Long.parseLong(res);
    }

    public long 참고할만한_풀이2(long n){
        String str = Long.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Long.parseLong(((sb.reverse()).toString()));
    }
}
