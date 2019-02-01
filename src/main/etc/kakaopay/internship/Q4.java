package etc.kakaopay.internship;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public int solution(int K, String[] user_scores) {
        int answer = 0;
        Map<String, Integer> ranking = new HashMap<>();

        for (String user_score : user_scores) {
            String name = user_score.split(" ")[0];
            int score = Integer.parseInt(user_score.split(" ")[1]);

            if(ranking.containsKey(name)) {

            }

            if(!ranking.containsKey(name) && ranking.keySet().size() < K) {
                ranking.put(name, score);
                answer++;
            }
        }

        return answer;
    }
}
