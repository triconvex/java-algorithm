package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _2577_숫자의개수 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int target = a * b * c;

        for (int i = 0; i <= 9; i++) {
            int cnt = 0;
            for (String digit : String.valueOf(target).split("")) {
                if(digit.equals(String.valueOf(i))) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}