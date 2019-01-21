package programmers.co.kr.Level_1;

/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

제한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

 */

public class 가운데글자가져오기 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        int length = s.length();

        if(length % 2 == 0) {
            return String.valueOf(c[length / 2 - 1]) + String.valueOf(c[length / 2]);
        }

        return String.valueOf(c[length / 2]);
    }


    public String 참고할만한_풀이(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
