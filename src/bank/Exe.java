package bank;

import java.util.*;

public class Exe {
    public static void main(String[] args) {

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
                String inputName = sc.nextLine();
                System.out.print("[계좌조회] 2. 주민등록번호('-' 포함)를 입력하세요: ");
                String inputSsn = sc.nextLine();

                for (int i = 0; i < accountArr.size(); i++) {
                    String searchName = accountArr.get(i).getName();
                    String searchSsn = accountArr.get(i).getSsn();
                    if (inputName.equals(searchName) && inputSsn.equals(searchSsn)) {
                        System.out.printf("%s님이 찾으시는 계좌는 %s입니다.\n", inputName, accountArr.get(i).getAccount());
                    } else {
                        System.out.println("입력한 정보와 일치하는 계좌가 존재하지 않습니다.");
                    }
                }

            } else if (choice == 3) {
                System.out.print("[입금] 1. 계좌를 입력하세요: ");
                String inputAccount = sc.nextLine();
                System.out.print("[입금] 2. 주민등록번호를 입력하세요: ");
                String inputSsn = sc.nextLine();
                System.out.print("[입금] 3. 입금할 금액을 입력하세요: ");
                int deposit = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < accountArr.size(); i++) {
                    String searchAccount = accountArr.get(i).getAccount();
                    String searchSsn = accountArr.get(i).getSsn();
                    int accountBalance = accountArr.get(i).getBalance();

                    if (inputAccount.equals(searchAccount) && inputSsn.equals(searchSsn)) {
                        accountArr.get(i).setBalance(accountBalance + deposit);
                        System.out.printf("%s님의 계좌 %s에 %d원이 입금되었습니다. 잔액은 %d원 입니다.\n", accountArr.get(i).getName(),
                                searchAccount, deposit, accountArr.get(i).getBalance());
                    }
                }
            } else if (choice == 4) {
                System.out.print("[출금] 1. 계좌를 입력하세요: ");
                String inputAccount = sc.nextLine();
                System.out.print("[출금] 2. 주민등록번호를 입력하세요: ");
                String inputSsn = sc.nextLine();
                System.out.print("[출금] 3. 비밀번호를 입력하세요: ");
                int inputPassword = sc.nextInt();
                System.out.print("[출금] 4. 출금할 금액을 입력하세요: ");
                int withdraw = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < accountArr.size(); i++) {
                    String searchAccount = accountArr.get(i).getAccount();
                    String searchSsn = accountArr.get(i).getSsn();
                    int searchPassword = accountArr.get(i).getPassword();
                    int accountBalance = accountArr.get(i).getBalance();

                    if (inputAccount.equals(searchAccount) && inputSsn.equals(searchSsn) && inputPassword == searchPassword
                        && accountArr.get(i).getBalance() >= withdraw) {
                        accountArr.get(i).setBalance(accountBalance - withdraw);
                        System.out.printf("%s님의 계좌 %s에 %d원이 출금되었습니다. 잔액은 %d원 입니다.\n", accountArr.get(i).getName(),
                                searchAccount, withdraw, accountArr.get(i).getBalance());
                    } else if(inputAccount.equals(searchAccount) && inputSsn.equals(searchSsn) && inputPassword == searchPassword
                            && accountArr.get(i).getBalance() < withdraw){
                        System.out.printf("잔액이 부족합니다. 현재 잔액은 %d원 입니다.\n", accountArr.get(i).getBalance());
                    }
                }
            } else if (choice == 5) {
                System.out.print("[잔액조회] 1. 조회하고자 하는 계좌번호를 입력하세요: ");
                String accountCheck = sc.nextLine();
                System.out.print("[잔액조회] 2. 조회하고자 하는 계좌의 비밀번호를 입력하세요: ");
                int passwordCheck = sc.nextInt();
                for (int i = 0; i < accountArr.size(); i++) {
                    String searchAccount = accountArr.get(i).getAccount();
                    int searchPassword = accountArr.get(i).getPassword();
                    int accountBalance = accountArr.get(i).getBalance();

                    if (accountCheck.equals(searchAccount) && passwordCheck == searchPassword) {
                        System.out.printf("%s님의 계좌 %s의 잔액은 %d원 입니다.\n", accountArr.get(i).getName(),
                                searchAccount, accountArr.get(i).getBalance());
                    }
                }

            } else if (choice == 6) {
                 System.out.println("시스템을 종료합니다.");
                 break;
            }
        }
    }

    public static Account accountCreate(String name, String ssn, String account, int password, int balance) {   //계좌개설
        Account a = new Account(name, ssn, account, password, balance);
        a.accountInfo();
        return a;
    }
}