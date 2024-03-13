package codingTest.day01;

import java.lang.*;

public class 숨어있는_숫자의_덧셈_1 {
    public static int solution(String my_string) {
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] result = my_string.split("");

        int answer = 0;

        for(String n : num){
            for(String r : result){
                if(n.equals(r)){
                    answer += Integer.parseInt(n);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }
}
