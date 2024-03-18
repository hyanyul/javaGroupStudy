package codingTest.day03;

//2: 가위, 0: 바위, 5: 보
public class 가위_바위_보 {
    public static String solution(String rsp) {
        String[] rspSplit = rsp.split("");
        String answer = "";

        for(int i=0; i< rspSplit.length; i++){
            if(rspSplit[i].equals("2")){
                answer += "0";
            } else if(rspSplit[i].equals("0")){
                answer += "5";
            } else if(rspSplit[i].equals("5")){
                answer += "2";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("205"));
    }
}
