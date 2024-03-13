package codingTest.day01;

public class 문자열안에_문자열 {
    public static int solution(String str1, String str2) {
        int answer = 2;

        int result = str1.indexOf(str2);

        if(result>-1){
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
}
