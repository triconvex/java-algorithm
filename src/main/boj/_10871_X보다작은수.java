package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10871_X보다작은수 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine().split(" ")[1]);
        String[] temp = bf.readLine().split(" ");

        for (String each : temp) {
            if(Integer.parseInt(each) < x) {
                System.out.print(each + " ");
            }
        }
    }
}
