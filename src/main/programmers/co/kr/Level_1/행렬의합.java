package programmers.co.kr.Level_1;

import java.util.ArrayList;
import java.util.List;

public class 행렬의합 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];

        for (int i = 0; i < arr1.length; i++) {
            List<Integer> element = new ArrayList<>();
            for (int j = 0; j < arr1[i].length; j++) {
                element.add(arr1[i][j] + arr2[i][j]);
            }
            answer[i] = element.stream().mapToInt(a->a).toArray();
        }

        return answer;
    }

    public int[][] 참고할만한_풀이(int[][] arr1, int[][] arr2) {
        int row = Math.max(arr1.length, arr2.length);
        int col = Math.max(arr1[0].length, arr2[0].length);
        int[][] answer = new int[row][col];
        for(int i=0; i<row ; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
