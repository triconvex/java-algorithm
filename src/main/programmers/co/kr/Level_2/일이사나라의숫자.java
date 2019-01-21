package programmers.co.kr.Level_2;

/*
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
 */

public class 일이사나라의숫자 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while(n > 0) {
            if(n % 3 == 0) {
                answer.insert(0, String.valueOf(4));
                n--;
            } else {
                answer.insert(0, String.valueOf(n % 3));
            }
            n = n / 3;
        }

        return answer.toString();
    }

    /**
     * 3진수에는 정작 '3'이란 숫자가 쓰이지 않는데,
     * 이건 3이 쓰이는 3진수라고 할 수 있다. (3일때 바로 자리올림하지 않는 특이한 3진수)
     * 그리고 이 3을 4로 바꾸어 문제의 구조를 한눈에 알아보기 어렵게 만들었다.
     */

    public String 참고할만한_풀이(int n) {
        String answer = "";
        int k = 0;

        while (n > 0) {
            k = n % 3; //나머지  - 자릿수 (낮은자리부터)
            n = n / 3; //몫      - 다음루프의 피제수
            if (k == 0) {
                n = n - 1; //자리올림을 안 하는 효과
                k = 4;
            }
            answer = k + answer;
        }
        return answer;
    }
}
