package programmers.co.kr.Level_2;

import org.testng.annotations.Test;

public class 큰수만들기 {
    public String solution(String number, int k) {
        StringBuilder temp = new StringBuilder(number);
        int index = 0;

        while(k > 0 && index != number.length() - 1) {
            if(temp.charAt(index) < temp.charAt(index + 1)) {
                temp.deleteCharAt(index);
                k--;
                index = 0;
            } else {
                index++;
            }
        }

        if(k == 0) {
            return temp.toString();
        }

        temp.delete(temp.length() - k ,temp.length());
        return temp.toString();
    }


    public String 참고할만한_풀이_by_Brad(String number, int k) {
        StringBuilder sb = new StringBuilder(number);

        while (k > 0) {
            boolean deleted = false;

            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) < sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                    deleted = true;
                    break;
                }
            }

            if (!deleted) {
                sb.deleteCharAt(sb.length() - 1);
            }

            k--;
        }
        return sb.toString();
    }

    @Test
    public void test() {
        String number = "10000";
        int k = 2;
        solution(number, k);
    }
}
