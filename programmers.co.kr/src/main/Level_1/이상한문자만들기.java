package Level_1;

public class 이상한문자만들기 {
    public String solution(String s) {
        char[] words = s.toLowerCase().toCharArray();
        StringBuilder answer = new StringBuilder();

        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if(words[i] == 32) {
                index = 0;
                answer.append(" ");
            } else if(index % 2 == 0) {
                answer.append(Character.toUpperCase(words[i]));
                index++;
            } else {
                answer.append(words[i]);
                index++;
            }
        }

        return answer.toString();
    }

    //깔끔한데 성능은 최초풀이가 근소하게 앞서는듯
    public String solution_2(String s) {
        StringBuilder answer = new StringBuilder();
        String[] array = s.split("");
        int index = 0;

        for (String ch : array) {
            index = ch.equals(" ") ? 0 : index + 1;
            answer.append(index % 2 == 0 ? ch.toLowerCase() : ch.toUpperCase());
        }

        return answer.toString();
    }


    public String 참고할만한_풀이(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
