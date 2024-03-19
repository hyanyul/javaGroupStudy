package codingTest.day04;

public class 대문자와_소문자 {
    public static String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            int a = (int)my_string.charAt(i);
            if(a>=65 && a<=90){
                answer += "" + (char)(a+32);
            }else if(a>=97 && a<=122){
                answer += "" + (char)(a-32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
    }
}
