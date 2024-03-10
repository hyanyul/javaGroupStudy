package calc;

import java.util.Scanner;

//계산기 기본
public class calc1 { 
    public static void main(String[] args){ //메인 메소드
        Scanner sc = new Scanner(System.in);    //Scanner 객체 생성

        System.out.print("정수 x를 입력해주세요: "); //정수 x 입력 안내
        int x = sc.nextInt();   //정수 x 입력

        System.out.print("정수 y를 입력해주세요: "); //정수 y 입력 안내
        int y = sc.nextInt();   //정수 y 입력

        sc.nextLine();  //입력 스트림에 남아있는 공백 제거

        System.out.print("연산자(+, -, *, /)를 입력하세요: ");   //연산자 입력 안내
        String o = sc.nextLine();   //연산자 입력

        if(o.equals("+")){  //연산자 + 입력 시
            System.out.printf("x+y=%d\n", x+y); //x+y 결과 출력
        } else if(o.equals("-")) {  //연산자 - 입력 시
            System.out.printf("x-y=%d\n", x-y); //x-y 결과 출력
        } else if(o.equals("*")) {  //연산자 * 입력 시
            System.out.printf("x*y=%d\n", x*y); //x*y 결과 출력
        } else if(o.equals("/")) {  //연산자 / 입력 시
            System.out.printf("x/y=%.2f\n", (double)x/y);   //x/y 결과 출력 - 결과 소수점 나오도록 double로 강제변환, 소수점 아래 두자리까지 나오도록 처리
        } else { //연산자 네가지 외의 다른 거 입력 시
            System.out.println("연산자를 잘못 입력하셨습니다."); //연산자 오류 안내
        }
    }
}
