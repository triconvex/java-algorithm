package programmers.co.kr.Level_1;

import java.util.Arrays;

public class 제일작은수제거하기 {
    //성능은 별로...

    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().orElse(-1);
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
