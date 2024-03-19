package codingTest.day04;

public class 배열_회전시키기 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("left")){
            for(int i=0; i<numbers.length; i++){
                if(i == 0){
                    answer[numbers.length-1] = numbers[i];
                }else {
                    answer[i - 1] = numbers[i];
                }
            }
        }else if(direction.equals("right")){
            for(int i=0; i<numbers.length; i++){
                if(i == numbers.length-1){
                    answer[0] = numbers[i];
                }else {
                    answer[i + 1] = numbers[i];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
