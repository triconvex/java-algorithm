package programmers.co.kr.Level_2;

/**
 * 우측이동할지 좌측이동할지 판단필요!
 * N(110) 이상은 아래로 내려가야함!
 */

public class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        int continuousA = 0;
        int lastContinuousA = 0;

        for (int i = 1; i < name.length(); i++) {
            if(name.charAt(i) == 'A') {
                continuousA++;
            } else{
                break;
            }
        }

        for (int i = name.length() - 1; i >= 0; i--) {
            if(name.charAt(i) == 'A') {
                lastContinuousA++;
            } else {
                break;
            }
        }

        for (char c : name.toCharArray()) {
            if(c > 'N') {
                answer += 'Z' - c + 1;
            } else {
                answer += c - 'A';
            }
        }

        if(continuousA >= 1) {
            answer += name.length() - continuousA - 1;
        } else {
            answer += name.length() - lastContinuousA - 1;
        }

        return answer;
    }


    public int 참고할만한_풀이(String name){
        int answer = 0;
        int n = name.length();
        int leftOrRight = name.length() - 1;

        for(int i = 0; i < n; i++) {
            int next = i + 1;
            char target = name.charAt(i);

            if(target <= 'N') {
                answer += target - 'A';
            }
            else {
                answer += 'Z' - target + 1;
            }

            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            leftOrRight = Math.min(leftOrRight, i + n - next + Math.min(i, n - next));
        }

        answer += leftOrRight;
        return answer;
    }
}
