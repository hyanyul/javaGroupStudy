package codingTest.day04;

public class 공_던지기 {
    public static int solution(int[] numbers, int k) {
        int a = (k-1)*2 % numbers.length;

        int answer = numbers[a];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }
}
