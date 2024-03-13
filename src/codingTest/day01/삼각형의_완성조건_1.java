package codingTest.day01;

import java.util.Arrays;

public class 삼각형의_완성조건_1 {
    public static int solution3(int[] sides) {
        int answer = 2;

        Arrays.sort(sides);

        if(sides[0]+sides[1]>sides[2]){
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution3(new int[]{199, 72, 222}));
    }
}
