package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2490_윷놀이 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        printResult(getValue(bf.readLine()));
        printResult(getValue(bf.readLine()));
        printResult(getValue(bf.readLine()));
    }

    private static int getValue(String values) {
        int temp = 0;
        for (String value : values.split(" ")) {
            if(value.equals("1")) {
                temp++;
            }
        }
        return temp;
    }

    private static void printResult(int result) {
        if(result == 0) {
            System.out.println("D");
        } else if (result == 1) {
            System.out.println("C");
        } else if (result == 2) {
            System.out.println("B");
        } else if (result == 3) {
            System.out.println("A");
        } else if (result == 4) {
            System.out.println("E");
        }
    }
}