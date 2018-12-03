package Level_2;

/*
181203
문제 설명
스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면
다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

종류	이름
얼굴	동그란 안경, 검정 선글라스
상의	파란색 티셔츠
하의	청바지
겉옷	긴 코트
스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
같은 이름을 가진 의상은 존재하지 않습니다.
clothes의 모든 원소는 문자열로 이루어져 있습니다.
모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
스파이는 하루에 최소 한 개의 의상은 입습니다.
 */

import java.util.*;

public class 위장 {
    public int solution(String[][] clothes) {
        HashMap<String, String> dresses = new HashMap<>();
        HashMap<String, Integer> closet = new HashMap<>();

        for (String[] clothe : clothes) {
            if(!dresses.getOrDefault(clothe[1], "").equals(clothe[0])) {
                dresses.put(clothe[1], clothe[0]);
                closet.put(clothe[1], closet.getOrDefault(clothe[1], 0) + 1);
            }
        }

        //풀다막힘, 어떻게 모든 경우의 수를 구할 것인가...?


        return 0;
    }

//    TODO : Iterator에 대해 자세히 알아보자 & 어떻게 각 밸류에 +1 후 모두 곱한 뒤 -1 을 하면 답이 되는지...?

    public int 참고할만한_풀이(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
