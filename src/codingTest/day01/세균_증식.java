package codingTest.day01;

import java.lang.*;

public class 세균_증식 {
    public static int solution1(int n, int t) {

        int answer = n * (int)(Math.pow(2, t));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(2, 10));
    }
}
