package buy.buy1;

public class Product {
    int id; //상품 번호 필드 선언
    String name;    //상품명 필드 선언
    int price;  //상품 가격 필드 선언
    int quantity;   //상품 수량 필드 선언

    Product(int id, String name, int price, int quantity){  //상품 등록 생성자 정의
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void proInfo(){  //상품 등록 후 메시지 출력
        System.out.printf("[상품등록] '상품번호: %d, 상품명: %s, 가격: %d원, 수량: %d개'가 등록되었습니다.\n", id, name, price, quantity);
    }
}
