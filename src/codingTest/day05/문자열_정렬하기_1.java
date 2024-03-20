package codingTest.day05;

import java.util.*;

public class 문자열_정렬하기_1 {
    public static int[] solution(String my_string) {

        ArrayList<Integer> a = new ArrayList<>();

        String[] check = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};    // 숫자를 찾기 위해 String 형태로 숫자를 저장한 배열 생성

        for(String c : check){  //향상된 for문 사용
            for(int i=0; i<my_string.length(); i++) {
                String input = "" + my_string.charAt(i);    //my_string 안의 문자를 하나하나 잘라 검사하기 위해 input 생성
                if (c.equals((input))){ //input과 c가 같을 때
                    a.add(Integer.parseInt(input)); //a에 Integer 형태의 input 넣음
                }
            }
        }

        int[] answer = new int[a.size()];

        for(int i=0; i<a.size(); i++){  //만들어진 a를 answer 배열로 만듦
            answer[i] = a.get(i);
        }

        Arrays.sort(answer);    //오름차순 정렬

        return answer;
    }

    public static void main(String[] args) {
        solution("hi12392");
    }
}
