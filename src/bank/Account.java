package bank;

public class Account {

    private String name;    //고객 이름
    private String ssn; //고객 주민번호
    private String account; //고객 계좌
    private int password;    //비밀번호
    private int balance;    //잔액


    Account(String name, String ssn, String account, int password, int balance){  //계좌 개설(생성자)
        this.name = name;
        this.ssn = ssn;
        this.account = account;
        this.password = password;
        this.balance = balance;
    }

    public void accountInfo(){  //계좌개설 확인
        System.out.printf("[계좌개설]'이름: %s, 주민등록번호: %s, 계좌번호: %s, 비밀번호: %d, 입금 금액: %d원' 계좌가 계" +
                        "설되었습니다.\n", name, ssn, account, password, balance);
    }

    public void deposit(int money){  //입금
        balance += money;
    }

    public void withdraw(int money){ //출금
        balance -= money;
    }

    public void balanceCheck(){  //잔액 조회
        System.out.printf("[잔액조회] %s 계좌의 잔액은 %d원 입니다.", account, balance);
    }

    public void getAccount(String name, String ssn) {   //계좌번호 조회
        System.out.printf("[계좌조회] %s님이 요청하신 계좌번호는 %s입니다.\n", name, this.account);

    }
}
