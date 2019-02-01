package etc.kakaopay.internship;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Q1 {
    //5번까지 다보고 1번 푸는데 40분걸렸음

    public int solution(String phone_number) {
        int countOfPlus = 0;
        int countOfDash = 0;

        for (String s : phone_number.split("")) {
            if(s.equals("-")) {
                countOfDash++;
            }

            if(s.equals("+")) {
                countOfPlus++;
            }
        }

        if(countOfPlus == 0 && countOfDash == 0 && phone_number.length() == 11) {
            if(phone_number.substring(0, 3).equals("010")) {
                return 2;
            }

            return -1;
        }

        if(countOfPlus == 0 && countOfDash == 2) {
            if(phone_number.substring(0, 4).equals("010-") && phone_number.lastIndexOf("-") == 8 && phone_number.length() == 13) {
                return 1;
            }

            return -1;
        }

        if(countOfPlus == 1 && countOfDash == 3) {
            if(phone_number.substring(0, 7).equals("+82-10-") && phone_number.lastIndexOf("-") == 11 && phone_number.length() == 16) {
                return 3;
            }

            return -1;
        }

        return -1;
    }

    @Test
    private void test() {
        Assert.assertEquals(solution("010-1234-1234"), 1);
        Assert.assertEquals(solution("01012341234"), 2);
        Assert.assertEquals(solution("+82-10-3434-2323"), 3);
        Assert.assertEquals(solution("010-1212-333"), -1);
        Assert.assertEquals(solution("+82-010-3434-2323"), -1);

    }
}
