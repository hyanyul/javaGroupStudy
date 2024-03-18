package codingTest.day03;

public class 모스부호_1 {
    public static String solution(String letter) {
        String answer = "";

        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-."
                        ,"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterSplit = letter.split(" ");

        for(int i=0; i<letterSplit.length;i++){
            for (int a=0; a< mos.length; a++) {
                if (letterSplit[i].equals(mos[a])) {
                    String ascii = "" + (char)(a + 97);
                    answer = answer.concat(ascii);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
