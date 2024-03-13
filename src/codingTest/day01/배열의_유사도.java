package codingTest.day01;

public class 배열의_유사도 {
    public static int solution2(String[] s1, String[] s2){

        int answer = 0;

        for(int i=0; i<s1.length; i++){
            for(int a=0; a<s2.length; a++){
                if(s1[i].equals(s2[a])){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution2(s1, s2));
    }
}
