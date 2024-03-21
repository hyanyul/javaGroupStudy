package codingTest.day06;

import java.util.*;

//자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return
public class 소인수분해_복습필요 {
    public static int[] solution(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=2; i<=n; i++){
            while(n % i == 0){
                if(!arr.contains(i)) {
                    arr.add(i);
                }
                n /= i;
            }
        }

        int[] answer = new int[arr.size()];

        for(int i=0; i<arr.size();i++){
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);    //오름차순 정렬
        return answer;
    }

    public static void main(String[] args) {
        solution(12);
    }
}
