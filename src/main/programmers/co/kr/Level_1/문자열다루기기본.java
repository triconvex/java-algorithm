package programmers.co.kr.Level_1;

/*
181121
문제 설명
        문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
        예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

        제한 사항
        s는 길이 1 이상, 길이 8 이하인 문자열입니다.
*/

public class 문자열다루기기본 {

    public boolean 제출(String s) {
        if (s.length() == 4 || s.length() == 6) {
            int a = 0;
            String[] arr = s.split("");

            try {
                for (String str : arr) {
                    a = Integer.parseInt(str);
                }
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }


    public boolean 참고할만한_풀이(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}