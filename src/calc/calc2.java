package calc;

import java.util.Scanner;

//계산기-함수 만들어서 계산
public class calc2 {

    public static int add(int x, int y){    //정적 멤버, int형 데이터 리턴하는 add 함수 정의
        return x + y;   //x+y값 리턴
    }

    public static int sub(int x, int y){    //정적 멤버, int형 데이터 리턴하는 sub 함수 정의
        return x - y;   //x-y값 리턴
    }

    public static int mul(int x, int y){    //정적 멤버, int형 데이터 리턴하는 mul 함수 정의
        return x * y;   //x*y값 리턴
    }

    public static double div(int x, int y){ //정적 멤버, double형 데이터 리턴하는 div 함수 정의
        return (double)x / y;   //x/y값 리턴
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 x를 입력해주세요: ");
        int x = sc.nextInt();

        System.out.print("정수 y를 입력해주세요: ");
        int y = sc.nextInt();

        sc.nextLine();

        System.out.print("연산자(+, -, *, /)를 입력하세요: ");
        String o = sc.nextLine();

        if(o.equals("+")){  //연산자 + 입력 시
            System.out.printf("x+y=%d\n", add(x, y));
        } else if(o.equals("-")) {
            System.out.printf("x-y=%d\n", sub(x, y));
        } else if(o.equals("*")) {
            System.out.printf("x*y=%d\n", mul(x, y));
        } else if(o.equals("/")) {
            System.out.printf("x/y=%.2f\n", div(x, y));
        } else {
            System.out.println("연산자를 잘못 입력하셨습니다.");
        }
    }
}
