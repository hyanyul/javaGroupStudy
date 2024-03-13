package codingTest.day01;

public class 자릿수_더하기 {
    public static int solution(int n) {
        int answer = 0;

        String sN = n +"";

        for(int i=0;i<sN.length();i++){
            answer += Integer.parseInt(sN.split("")[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(1234));
    }
}
