package programmers.co.kr.Level_1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        return s.indexOf(0) == '-' ? -Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
    }
}
