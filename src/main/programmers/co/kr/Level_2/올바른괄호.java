package programmers.co.kr.Level_2;

public class 올바른괄호 {
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if(count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}

//다른풀이는 없을까?
