package Level_1;

/*
181129
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*/

import java.util.*;

public class 완주하지못한선수 {
    //풀긴풀었는데 엄청 더럽고... 복잡하게...

    public String solution(String[] participant, String[] completion) {
        HashSet<String> part = new HashSet<>(Arrays.asList(participant));
        HashSet<String> comp = new HashSet<>(Arrays.asList(completion));

        if(part.size() != comp.size()) {
            part.removeAll(comp);
            return (String) part.toArray()[0];
        }

        HashSet<String> dupes = new HashSet<>();
        for (String player : participant) {
            if(!dupes.add(player)) {
                if(Arrays.stream(participant)
                        .filter(p -> p.equals(player))
                        .toArray().length
                        !=
                        Arrays.stream(completion)
                                .filter(p -> p.equals(player))
                                .toArray().length) {
                    return player;
                }
            }
        }

        return null;
    }

//    TODO : map에 대한 이해 필요, getOrDefault 등

    public String 참고할만한_풀이(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String player : participant) {
            //비어있으면 0에서 +1, 비어있지않으면 해당 value에 +1
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            //compeltion에 있으면 value -1
            hm.put(player, hm.get(player) - 1);
        }

        for (String key : hm.keySet()) {
            //결과적으로 0이 되어야 정상적으로 완주
            if (hm.get(key) != 0){
                return key;
            }
        }

        return null;
    }
}

