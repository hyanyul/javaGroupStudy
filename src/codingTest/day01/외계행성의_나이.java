package codingTest.day01;

public class 외계행성의_나이 {
    public static String solution(int age) {
        String ageS = age + ""; //나이 문자열로 변환
        String[] ageSplit = ageS.split(""); //문자열로 변환한 나이 한글자씩 자름

        String answer = ""; //return할 문자열 변수 선언

        for(int i=0; i<ageSplit.length; i++){   //나이 문자열 길이만큼 반복문 반복
            char a = (char)(Integer.parseInt(ageSplit[i]) + 97);    //문자열 i번째 인덱스 int형으로 바꿔서 97 더한 뒤 다시 문자형으로 변환(아스키코드 97=='a' 이용)
            answer = answer.concat(Character.toString(a));  //아스키코드 이용해서 변환한 문자 a를 다시 문자열로 변환한 뒤 answer에 연결
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
    }
}
