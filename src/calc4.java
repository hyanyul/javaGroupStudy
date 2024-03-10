import java.util.Scanner;

//계산기-while문 사용해서 종료 옵션 추가
public class calc4 {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y){
        return x - y;
    }

    public static int mul(int x, int y){
        return x * y;
    }

    public static double div(int x, int y){
        return (double)x / y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {   //while문 - 종료 선택지 추가
            System.out.print("정수 x를 입력해주세요: ");
            int x = sc.nextInt();

            System.out.print("정수 y를 입력해주세요: ");
            int y = sc.nextInt();

            sc.nextLine();

            System.out.print("연산자(+, -, *, /)를 입력하세요: ");
            String o = sc.nextLine();

            if (o.equals("+")) {  //연산자 + 입력 시
                System.out.printf("x+y=%d\n", add(x, y));
            } else if (o.equals("-")) {
                System.out.printf("x-y=%d\n", sub(x, y));
            } else if (o.equals("*")) {
                System.out.printf("x*y=%d\n", mul(x, y));
            } else if (o.equals("/")) {
                System.out.printf("x/y=%.2f\n", div(x, y));
            } else {
                System.out.println("연산자를 잘못 입력하셨습니다.");
            }

            System.out.println("프로그램을 종료하려면 'q', 아니면 아무 키를 입력하세요.");    //종료 방법 안내
            String end = sc.nextLine(); //종료 키워드 저장용 변수 선언
            if(end.equals("q")){    //q 입력 시
                System.out.println("계산기 프로그램을 종료합니다."); //계산기 종료 안내 출력
                break;  //break 통해 while문 탈출
            }

        }
    }
}
