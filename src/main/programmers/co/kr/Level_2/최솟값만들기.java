package programmers.co.kr.Level_2;

/*
181123
문제 설명
길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며,
두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
(단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)

예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면

A에서 첫번째 숫자인 1, B에서 두번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
A에서 세번째 숫자인 2, B에서 첫번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
즉, 이 경우가 최소가 되므로 29를 return 합니다.

배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 A, B의 크기 : 1000 이하의 자연수
배열 A, B의 원소의 크기 : 1000 이하의 자연수
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 최솟값만들기 {
    public int 최종풀이(int[] A, int[] B) {
        int answer = 0;

        int[] a = Arrays.stream(A).sorted().toArray();
        int[] b = Arrays.stream(B).sorted().toArray();

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[a.length - i - 1];
        }

        return answer;
    }


    public int 참고할만한_풀이(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }


    public int 이차풀이(int[] A, int[] B) {
        //테스트 4개 중 1개 시간초과
        int answer = 0;
        int[] a = Arrays.stream(A).sorted().toArray();
        int[] b = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }


    public int 일차풀이(int []A, int []B) {
        //테스트 4개 중 3개 시간초과
        int answer = 0;
        List<Integer> a = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int i = 0; i < a.size(); i++) {
            answer += a.get(i) * b.get(i);
        }

        return answer;
    }
}
