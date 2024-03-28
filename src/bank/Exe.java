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

        while (true) {
            System.out.println("""
                    ---<메뉴>---
                    1. 계좌개설
                    2. 계좌조회
                    3. 입금
                    4. 출금
                    5. 잔액조회
                    6. 종료""");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("[계좌개설] 1. 이름을 입력하세요: ");
                name = sc.nextLine();
                System.out.print("[계좌개설] 2. 주민등록번호('-' 포함)를 입력하세요: ");
                ssn = sc.nextLine();
                System.out.print("[계좌개설] 3. 원하는 계좌번호를 입력하세요: ");
                account = sc.nextLine();
                System.out.print("[계좌개설] 4. 비밀번호를 입력하세요(숫자 4자리): ");
                password = sc.nextInt();
                sc.nextLine();

                accountArr.add(accountCreate(name, ssn, account, password, balance));


            } else if (choice == 2) {
                System.out.print("[계좌조회] 1. 이름을 입력하세요: ");
                String searchName = sc.nextLine();
                System.out.print("[계좌조회] 2. 주민등록번호('-' 포함)를 입력하세요: ");
                String searchAccount = sc.nextLine();

                

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if(choice == 5) {

            } else if (choice == 6) {
                System.out.println("시스템을 종료합니다.");
                break;
            }




        }

    }

    public static void inputAccount(){

    }

    public static Account accountCreate(String name, String ssn, String account, int password, int balance){   //계좌개설
        Account a = new Account(name, ssn, account,password, balance);
        a.accountInfo();
        return a;
    }


}
