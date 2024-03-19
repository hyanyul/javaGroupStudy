package codingTest.day04;

public class 주사위의_개수 {
    public static int solution(int[] box, int n) {
        int a = box[0]/n;
        int b = box[1]/n;
        int c = box[2]/n;

        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1));
    }
}
