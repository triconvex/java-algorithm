package programmers.co.kr.Level_2;

//17:51 ~ 17:57
public class 하샤드수 {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        int initX = x;

        while(initX != 0) {
            sumOfDigits += initX % 10;
            initX /= 10;
        }

        return x % sumOfDigits == 0;
    }



    //효율성은 아래가 더 떨어짐, 나은 코드일까?
    private int sum = 0;

    public boolean 참고할만한_풀이(int x) {
        Integer.toString(x).chars().forEach(c -> sum += c - '0');
        return x % sum == 0;
    }
}