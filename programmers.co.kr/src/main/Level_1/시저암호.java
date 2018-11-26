package Level_1;

public class 시저암호 {
    public String solution(String s, int n) {
        byte[] barr = s.getBytes();

        for (int i = 0; i < barr.length; i++) {
            if (barr[i] >= 65 && barr[i] <= 90) {
                barr[i] += n;
                if (barr[i] > 90) {
                    barr[i] -= 26;
                }
            }

            //byte 자료형의 범위 -128 ~ 127, 127이 넘어가는 수를 저장하면 음수로 인식!
            if (barr[i] >= 97 && barr[i] <= 122) {
                if (barr[i] + n > 122) {
                    barr[i] -= 26;
                    barr[i] += n;
                } else {
                    barr[i] += n;
                }
            }
        }

        return new String(barr);
    }

    //char, byte에 대한 이해 필요
    //굳이 byte로 풀어서 최대크기인 127을 고려하지 말자
    //아스키 범위로 대/소문자 구분하지 말고 Character의 메서드 이용하면 간단

    public String 참고할만한_풀이(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}
