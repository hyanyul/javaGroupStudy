package codingTest.day01;

public class 제곱수_판별하기 {
    public static int solution(int n) {
        int answer = 2;

        for(int i=1;i<=n; i++){
            if(n / i == i && n % i == 0){
                answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(976));
    }
}
