package etc.woowa;

//TODO: Integer.parseInt 에서 String s, ind radix를 인자로 받아 진수변환 해주는 메서드 있으니 이용
//TODO: while문 내 로직을 따로 빼서 간결화 하거나, 재귀이용해서 리팩토링 해보기

//15분
public class WWFirst {
    public int solution(String S) {
        int answer = 0;
        int number = 0;
        String[] parsed = S.split("");

        for (int i = S.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(parsed[S.length() - i - 1]) == 1) {
                number += Math.pow(2, i);
            }
        }

        while (number != 0) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number--;
            }

            answer++;
        }

        return answer;
    }
}