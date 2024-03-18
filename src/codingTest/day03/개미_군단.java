package codingTest.day03;

public class 개미_군단 {
    public static int solution(int hp) {

        // 공격력 - 장군: 5, 병정: 3, 일: 1 / 최대한 적은 수로 공격

        int a = hp/5;
        int b = (hp-a*5)/3;
        int c = (hp-a*5-b*3);

        int answer = a+b+c;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
    }

}
