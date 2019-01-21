package etc.woowa;

import org.junit.Test;

import static org.junit.Assert.*;

public class WWFourthTest {

    @Test
    public void solution() {
        WWFourth resolve = new WWFourth();
        int[] A = {1, 2, 4, 10, 10, 10, 25};
        for (int i : A) {
            System.out.println(resolve.이진탐색개념(A, i));
        }
        for (int i : A) {
            System.out.println(resolve.최초풀이(A, i));
        }
//        assertEquals(resolve.solution(A, X), 6);
    }
}