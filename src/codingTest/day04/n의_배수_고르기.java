package codingTest.day04;

import java.util.*;

public class n의_배수_고르기 {
    public static int[] solution(int n, int[] numlist) {
        ArrayList<Integer> a = new ArrayList<>();

        for(Integer num : numlist){
            if(num % n == 0){
                a.add(num);
            }
        }

        int[] answer = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            answer[i] = a.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3 ,new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
    }
}
