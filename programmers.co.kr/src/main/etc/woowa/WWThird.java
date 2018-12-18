package etc.woowa;

import java.util.*;

//11:19 ~ 12:19
public class WWThird {
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        Queue<Person> people = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            people.add(new Person(A[i], B[i]));
        }

        int answer = 0;

        while(!people.isEmpty()) {
            int totalWeight = 0;
            int count = 0;
            int lastFloor = 0;

            while(!people.isEmpty() && people.peek().getWeight() + totalWeight <= Y && count < X) {
                Person temp = people.remove();
                totalWeight += temp.getWeight();
                count ++;
//큐 대신 리스트 써도 가능하다
//3명이 탔는데 1층2명, 3층1명일때 나는 1->3->1인데 1층에서 2명이 한번에 내리도록 구현하자
                if (temp.getFloor() != lastFloor && temp.getFloor() <= M) {
                    answer++;
                }
            }

            answer++;
        }

        return answer;
    }
}

class Person {
    private int weight;
    private int floor;

    Person(int weight, int floor) {
        this.weight = weight;
        this.floor = floor;
    }

    public int getWeight() {
        return weight;
    }

    public int getFloor() {
        return floor;
    }
}
