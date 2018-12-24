package Level_2;

//20:18 ~


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int numberOfTasks = progresses.length;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numberOfTasks; i++) {
            int finished = 0;

            while(progresses[i] + speeds[i] < 100) {
                for (int j = 0; j < numberOfTasks; j++) {
                    progresses[j] += speeds[j];
                }
            }

            for (int j = 0; j < numberOfTasks; j++) {
                progresses[j] += speeds[j];
            }

            for (int j = i + 1; j < numberOfTasks; j++) {
                if(progresses[j] >= 100) {
                    finished++;
                    i++;
                } else {
                    break;
                }
            }

            finished++;
            temp.add(finished);

            for (int progress : progresses) {
                System.out.print(progress + " ");
            }
            System.out.println("");
        }

        for (Integer integer : temp) {
            System.out.println(integer);
        }

        return temp.stream().mapToInt(i -> i).toArray();
    }


    public int[] 참고할만한_풀이(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}


