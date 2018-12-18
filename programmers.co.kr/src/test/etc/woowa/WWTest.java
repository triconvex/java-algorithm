package etc.woowa;

import etc.woowa.WW;
import org.junit.Test;

import static org.junit.Assert.*;

public class WWTest {

    @Test
    public void solution() {
        WW resolve = new WW();
        String S = "011100";
//        assertEquals(resolve.solution(S), 7);

        S = "photo.jpg, seoul, 2018-11-10 08:00:05\n" +
                "wow.png, newyork, 2018-10-15 12:15:05\n" +
                "a.jpg, seoul, 2018-10-07 12:15:05\n" +
                "b.jpg, paris, 2016-10-09 17:15:44\n" +
                "c.jpg, paris, 2016-07-13 19:15:22\n" +
                "d.jpg, seoul, 2018-06-14 17:18:22\n" +
                "e.jpg, seoul, 2018-08-22 13:11:13\n" +
                "1111.jpg, paris, 2018-10-14 12:15:05\n" +
                "f.jpg, seoul, 2018-09-11 14:02:12\n" +
                "g.png, seoul, 2018-05-11 09:02:23\n" +
                "h.jpeg, seoul, 2018-02-11 07:02:44\n" +
                "i.jpg, seoul, 2017-10-14 12:17:07\n" +
                "j.jpg, seoul, 2017-10-14 12:16:02\n" +
                "k.jpg, seoul, 2017-10-14 12:15:05";

        String result = "Seoul10.jpg\n" +
                "Newyork1.png\n" +
                "Seoul09.jpg\n" +
                "Paris2.jpg\n" +
                "Paris1.jpg\n" +
                "Seoul06.jpg\n" +
                "Seoul07.jpg\n" +
                "Paris3.jpg\n" +
                "Seoul08.jpg\n" +
                "Seoul05.png\n" +
                "Seoul04.jpeg\n" +
                "Seoul03.jpg\n" +
                "Seoul02.jpg\n" +
                "Seoul01.jpg";

        String a = String.format("%02d", 8);
        System.out.println(a);


        assertEquals(resolve.solution(S), result);
        System.out.println(resolve.solution(S));
    }
}