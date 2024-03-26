package bank;

import java.util.*;

public class Exe {
    public static void main(String[] args){
//        1. 계좌개설
//        2. 입금
//        3. 출금
//        4. 잔액조회
//        5. 종료
        Scanner sc = new Scanner(System.in);

        System.out.println("은행 입출금 관리 시스템을 시작합니다. ");

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (true){
            System.out.println("""
                    ---<메뉴>---
                    1. 계좌개설
                    2. 입금
                    3. 출금
                    4. 잔액조회
                    5. 종료""");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {
                System.out.println("시스템을 종료합니다.");
                break;
            }




        }

    }

    public static void accountCreate(String name, String ssn, String account, int password, int balance){   //계좌개설
        Account a = new Account(name, ssn, account,password, balance);
        a.accountInfo();
    }


}
