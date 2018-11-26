package Level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class 시저암호Test {
    @Test
    public void testOne() {
        assertEquals(new 시저암호().solution("AB", 1), "BC");
    }

}