import java.util.Scanner;

//계산기-try, catch문으로 정수, 연산자 입력 받을 때 다른 거 넣으면 예외처리
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

        while(true) {   //계산기 무한루프
            int x;
            System.out.print("정수 x를 입력해주세요: ");
            while(true) {   //정수 외의 값 입력 시 다시 입력하도록 무한 루프 만듦
                try {
                    x = sc.nextInt();
                    break;
                } catch (Exception e) {
                    sc.nextLine();  //입력 스트림 공백 제거
                    System.out.println("정수를 입력하세요.");
                }
            }
            
            int y;
            System.out.print("정수 y를 입력해주세요: ");
            while(true) {   //정수 외의 값 입력 시 다시 입력하도록 무한 루프 만듦
                try {
                    y = sc.nextInt();
                    break;
                } catch (Exception e){
                    sc.nextLine();  //입력 스트림 공백 제거
                    System.out.println("정수를 입력하세요.");
                }
            }

            sc.nextLine();

            System.out.print("연산자(+, -, *, /)를 입력하세요: ");
            while(true) {   //연산자 외의 값 입력 시 다시 입력하도록 무한 루프 만듦
                String o = sc.nextLine();
                if (o.equals("+")) {
                    System.out.printf("x+y=%d\n", add(x, y));
                    break;
                } else if (o.equals("-")) {
                    System.out.printf("x-y=%d\n", sub(x, y));
                    break;
                } else if (o.equals("*")) {
                    System.out.printf("x*y=%d\n", mul(x, y));
                    break;
                } else if (o.equals("/")) {
                    if(Double.isInfinite(div(x, y))){   //분모에 0 올 수 없음 -> 0 입력 시 Infinity가 아닌 안내 문구 출력되도록 변경
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }else {
                        System.out.printf("x/y=%.2f\n", div(x, y));
                        break;
                    }
                } else{
                    System.out.println("연산자(+, -, *, /) 중 하나를 입력하세요.");
                }
            }

            System.out.println("프로그램을 종료하려면 'q', 아니면 아무 키를 입력하세요.");
            String end = sc.nextLine();
            if(end.equals("q")){
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }

        }
    }
}
