package Level_2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class 전화번호목록Test {

    @Test
    public void solutionTest() {
        전화번호목록 resolve = new 전화번호목록();
        String[] phone_book = {"113", "12340", "123440", "12345", "98346"};

        System.out.println(resolve.solution(phone_book));
    }

}