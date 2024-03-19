package codingTest.day03;

public class 구슬을_나누는_경우의_수_복습필요 {
    public static int solution(int balls, int share) {
        //for문 사용 시 연산 중 값이 커지면 값이 제대로 저장 안되는 문제 발생
        //재귀함수 사용 필요
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        // nCr = (n-1)Cr + (n-1)C(r-1) 이용
        if (balls == share || share == 0) {   //balls가 share와 같거나 share가 0일 경우 경우의 수는 1개이므로 1 리턴
            return 1;
        } else {
            return combination(balls - 1, share) + combination(balls - 1, share - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(30, 3));
    }
}
