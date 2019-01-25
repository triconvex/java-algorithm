package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1015_수열정렬 {
    //TODO : 같은 숫자 있을 때 인덱스 처리필요

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        int[] target = getValue(bf.readLine());

        int[] sorted = Arrays.copyOf(target, target.length);
        Arrays.sort(sorted);

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if(target[i] == sorted[j]) {
                    System.out.print(j + " ");
                    sorted[j] = -1;
                }
            }
        }
    }

    private static int[] getValue(String values) {
        String[] str = values.split(" ");
        int[] temp = new int[str.length];


        for (int i = 0; i < temp.length; i++) {
            temp[i] = Integer.parseInt(str[i]);
        }

        return temp;
    }
}