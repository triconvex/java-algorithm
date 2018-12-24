package Level_2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class 기능개발Test {

    @Test
    public void one() {
        기능개발 resolve = new 기능개발();
        int[] progreeses = {93,30,55};
        int[] speeds = {1,30,5};
        int[] result = {2,1};

        assertArrayEquals(resolve.참고할만한_풀이(progreeses,speeds), result);
    }

    @Test
    public void two() {
        기능개발 resolve = new 기능개발();
        int[] progreeses = {15, 1, 14, 9, 29, 25, 17, 24, 4, 27, 7, 19, 29, 14, 23, 4, 21, 3, 8, 14};
        int[] speeds = {9, 11, 21, 16, 11, 21, 7, 5, 6, 30, 11, 24, 26, 18, 20, 18, 15, 30, 7, 18};
        int[] result = {6, 1, 13};

        assertArrayEquals(resolve.참고할만한_풀이(progreeses,speeds), result);
    }
}