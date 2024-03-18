package codingTest.day03;

public class 구슬을_나누는_경우의_수 {
    public static int solution(int balls, int share) {
        long a = 1;  //n!
        long b = 1;  //m!
        long c = 1;  //(n-m)!

        for(int i=balls; i>0; i--){
            a *= i; //n!
        }

        for(int i=share; i>0; i--){
            b *= i; //m!
        }

        for(int i=balls-share; i>0; i--){
            c *= i; //(n-m)!
        }

        int answer = (int)(a / (b * c));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(30, 3));
    }
}
