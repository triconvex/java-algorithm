package etc.woowa;

//10분? + 13:35 ~ 13:42 (에러나서 추가 'l < N - 1' 조건)
public class WWFourth {
    int 최초풀이(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int l = 0;
        int r = N - 1;

        while (A[l] != X && l < N - 1) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r--;
            } else {
                l++;
            }
        }

        if (A[l] == X) {
            return l;
        }
        return -1;
    }

    int 이진탐색개념(int[] A, int X) {
        //TODO: 이진탐색 학습하고 다시 접해보기
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (int) Math.round((l + r) / 2.0);
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}

