package programmers.co.kr.Level_1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(i % 2 == 0 ? "수" : "박");
        }

        return answer.toString();
    }

    public String 참고할만한_풀이(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
