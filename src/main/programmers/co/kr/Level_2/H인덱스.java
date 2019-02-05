package programmers.co.kr.Level_2;

import org.testng.annotations.Test;

import java.util.Arrays;

public class H인덱스 {
    public int solution(int[] citations) {

        for (int h = 10000; h > 0; h--) {
            int index = 0;

            for (int citation : citations) {
                if (citation >= h) {
                    index++;
                }

                if(index == h) {
                    return h;
                }
            }
        }

        return 0;
    }

    @Test
    private void test() {
        int[] citations = {3,0,6,1,5};

    }


    public int 참고할만한_풀이(int[] citations) {

        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}
