package codingTest.day02;

//응급도가 높은 순서대로 진료 순서를 정한 배열을 return
public class 진료_순서_정하기_복습필요 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i=0; i<emergency.length; i++){
            for(int a=0; a<emergency.length; a++){
                if(emergency[i] < emergency[a]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] input = new int[]{3, 76, 24};

        solution(input);

        for(int i=0; i< input.length; i++) {
            System.out.print(solution(input)[i] + "\t");
        }
    }
}
