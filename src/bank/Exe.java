package bank;

import java.util.*;

public class Exe {
    public static void main(String[] args){

        ArrayList<Account> accountArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String name;
        String ssn;
        String account;
        int password;
        int balance = 0;

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
                System.out.print("[계좌개설] 1. 이름을 입력하세요: ");
                name = sc.nextLine();
                System.out.print("[계좌개설] 2. 주민등록번호 13자리를 입력하세요: ");
                ssn = sc.nextLine();
                System.out.print("[계좌개설] 3. 원하는 계좌번호를 입력하세요: ");
                account = sc.nextLine();
                System.out.print("[계좌개설] 4. 비밀번호를 입력하세요(숫자 4자리): ");
                password = sc.nextInt();
                sc.nextLine();

                accountCreate(name, ssn, account, password, balance);

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
