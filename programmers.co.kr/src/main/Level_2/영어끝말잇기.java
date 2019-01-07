package Level_2;

import java.util.ArrayList;
import java.util.List;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        List<String> quoted = new ArrayList<>();
        quoted.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if(quoted.contains(words[i]) || words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                return new int[]{i % n + 1, i / n + 1};
            }
            quoted.add(words[i]);
        }

        return new int[]{0, 0};
    }
}
