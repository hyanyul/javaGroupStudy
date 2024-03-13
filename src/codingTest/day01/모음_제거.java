package codingTest.day01;

public class 모음_제거 {
    public static String solution(String my_string) {
        String answer = my_string;

        char[] del = {'a', 'e', 'o', 'i', 'u'};
        for(char c:del){
            answer = answer.replace(String.valueOf(c), "");
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("bus"));
    }
}
