package codingTest.day03;

public class _2차원으로_만들기 {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int idx = 0;
        for(int i=0; i<num_list.length; i++){
            int[] m = new int[n];
            for(int a=0; a<n; a++){
                m[a] = num_list[i];
                i++;
            }
            if((i+1) % n == 0){
                answer[idx] = m;
                System.out.println(answer[idx][0]);
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
//        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
    }
}
