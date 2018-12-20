package Level_2;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int time = 1;

            for (int j = i + 1; j < prices.length - 1; j++) {
                if (prices[i] > prices[j]) {
                    break;
                }

                time++;
            }

            answer[i] = time;
        }

        answer[answer.length - 1] = 0;
        return answer;
    }
}
