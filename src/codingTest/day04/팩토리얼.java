package codingTest.day04;

public class 팩토리얼 {
    public static int solution(int n) {
        int answer = 1;

        while(true){
            int a = 1;
            for(int i=1; i<=answer; i++){
                a *= i;
            }
            if(a>n) {
                break;
            }
            answer++;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(3628800));
    }
}
