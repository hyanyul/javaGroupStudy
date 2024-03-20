package codingTest.day05;

import java.util.*;

//자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return
public class 소인수분해 {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                int c = 0;
                for(int a=1; a<=i; a++){
                    if(i%a==0){
                        c++;
                    }
                }
                if(c<=2){
                    arr.add(i);                }
            }
        }

        int[] answer = {};
        Arrays.sort(answer);    //오름차순 정렬
        return answer;
    }

    public static void main(String[] args) {

    }
}
