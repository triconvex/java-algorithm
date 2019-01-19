package Level_1;

import java.util.*;
import java.util.stream.Collectors;

public class Jadencase문자열만들기 {
    public String solution(String s) {
        boolean flag = true;
        StringBuilder low = new StringBuilder();

        for (String letter :s.toLowerCase().split("")){
            if(flag) {
                low.append(letter.toUpperCase());
            } else {
                low.append(letter);
            }

            flag = letter.equals(" ");
        }

        return low.toString();
    }


    public String solution2(String s) {
//      이것도 런타임에러
        String[] temp = s.toLowerCase().split(" ");
        StringBuilder answer = new StringBuilder();

        answer.append(capitalizeFirstLetter(temp[0]));
        for (int i = 1; i < temp.length; i++) {
            answer.append(" ").append(capitalizeFirstLetter(temp[i]));
        }

        return answer.toString();

//        효율성실패!
//        return Arrays.stream(s.toLowerCase().split(" "))
//                .map(this::capitalizeFirstLetter)
//                .collect(Collectors.joining(" "));
    }

    private String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }


    //성능차이 어마무시~~~
    public String 참고할만한_풀이(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer.append(flag ? ss.toUpperCase() : ss);
            //공백을만나면 flag가 false가 되고, 그 다음 문자만 대문자로
            flag = ss.equals(" ");
        }

        return answer.toString();
    }
}
