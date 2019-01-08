package Level_2;

public class 예상대진표 {
    public int solution(int n, int a, int b) {
        int count = 0;

        while(a != b) {
            a = getNextNumber(a);
            b = getNextNumber(b);
            count++;
        }

        return count;
    }

    private int getNextNumber(int a) {
        if(a % 2 == 0) {
            return a / 2;
        }
        return a / 2 + 1;
    }


//getNextNumber 로직 간결화, 나머지를 더함으로써
    public int 참고할만한_풀이(int n, int a, int b) {
        int round = 0;

        while(a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            round++;
        }

        return round;
    }
}
