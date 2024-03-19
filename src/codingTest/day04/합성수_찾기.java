package codingTest.day04;

public class 합성수_찾기 {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int k = 0;
            for(int a=1; a<=i; a++){
                if(i % a == 0){
                    k++;
                }
            }
            if(k>2){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
