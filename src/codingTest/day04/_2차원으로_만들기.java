package codingTest.day04;

public class _2차원으로_만들기 {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int idx = 0;
        for(int i=0; i<answer.length; i++){
            for(int a=0; a<n; a++) {
                answer[i][a] = num_list[idx];
                idx++;
            }
            if(idx==num_list.length){
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
//        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
    }
}
