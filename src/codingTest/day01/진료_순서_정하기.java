package codingTest.day01;

import java.util.Arrays;

public class 진료_순서_정하기 {
    public static int[] solution(int[] emergency) {

        int max = 0;
        int num = emergency.length;

        int[] answer = new int[num];

        int[] change = new int[num];
        for(int i=0; i<num; i++){
            change[i] = emergency[i];
        }

        Arrays.sort(change);    //오름차순 정렬

        for(int i=0; i<num; i++){
            for(int n : change){
                if(n == emergency[i]){
                    answer[i] = change.indexOf(n);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 76, 24}));
    }
}
