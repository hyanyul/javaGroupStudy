package buy.buy2;

import java.util.ArrayList;

public class Customer {
    int id; //회원번호
    String name;    //회원명
    int age;    //회원 나이
    ArrayList<Product> cart = new ArrayList<>();    //장바구니(ArrayList 사용)

    //생성자 오버로딩 - 회원 등록
    Customer(int id, String name, int age, ArrayList<Product> cart){
        this.id = id;   //필드 초기화
        this.name = name;
        this.age = age;
        this.cart = cart;
    }

    //회원 등록 확인
    public void cusInfo(){
        System.out.printf("[회원등록] '회원번호: %d, 회원명: %s, 나이: %d세'가 등록되었습니다.\n", id, name, age);
    }

    
    //장바구니 담기
    public void addToCart(Product choice, int quantity){
        cart.add(new Product(choice.id, choice.name, choice.price, quantity));  //cart에 새로운 Product 객체 생성해서 넣어줌
        choice.quantity -= quantity;    //기존 Product 객체의 수량 변경(재고-선택 수량)
        System.out.printf("장바구니에 %s을(를) %d개 담았습니다.\n", choice.name, quantity);
    }

    //장바구니 상품 구매
    public void buyCart(){
        int sum = 0;
        for(int i=0; i< cart.size(); i++){
            sum += cart.get(i).price * cart.get(i).quantity;
        }
        System.out.printf("%s님이 결제할 총 금액은 %d원 입니다.\n", name, sum);
    }

}
