package Level_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 */

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        ArrayList<String> sorted = new ArrayList<>(Stream.of(phone_book).sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
        ArrayList<String> removed = new ArrayList<>(Stream.of(phone_book).sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

        for (String selected : sorted) {
            removed.remove(selected);
            for (String remain : removed) {
                if(remain.startsWith(selected)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean 참고할만한_풀이(String[] phone_book) {
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
    }
}
