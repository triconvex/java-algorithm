package programmers.co.kr.Level_2;

/**
 * 처음 한 번은 무조건 점프
 * 이후 점프와 순간이동을 조합하여 최소한의 점프로 n에 도착할 것!
 * 마지막 도착은 순간이동으로 하는 게 효율적일 거라고 예상되는데
 */

public class 점프와순간이동 {
    public int solution(int n) {
        int countOfJump = 0;

        while(n != 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                countOfJump++;
            }
        }

        return countOfJump;
    }


    //else 안쓰도록 리팩토링
    public int 참고할만한_풀이(int n) {
        int countOfJump = 0;

        while(n != 0) {
            if(n % 2 == 1) {
                n--;
                countOfJump++;
            }

            n /= 2;
        }

        return countOfJump;
    }
}