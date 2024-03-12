package buy.buy2;

public class Product {
    int id;
    String name;
    int price;
    int quantity;

    Product(int id, String name, int price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void proInfo(){
        System.out.printf("[상품등록] '상품번호: %d, 상품명: %s, 가격: %d원, 수량: %d개'가 등록되었습니다.\n", id, name, price, quantity);
    }
}
