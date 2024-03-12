package buy.buy2;

import java.util.ArrayList;

//ArrayList 사용한 장바구니 프로그램
public class Exe {
    public static void main(String[] args) {
        //회원 등록
        Customer c1 = new Customer(1, "한성지", 24, new ArrayList<>());
        Customer c2 = new Customer(2, "홍길동", 30, new ArrayList<>());
        Customer c3 = new Customer(3, "고길동", 45, new ArrayList<>());

        //회원 등록 확인
        c1.cusInfo();
        c2.cusInfo();
        c3.cusInfo();

        System.out.println();

        //----------------------------------------------------------------------------
        
        //상품 등록
        Product p1 = new Product(1, "우유", 1000, 60);
        Product p2 = new Product(2, "미에로화이바", 1800, 40);
        Product p3 = new Product(3, "천하장사", 500, 200);
        Product p4 = new Product(4, "초코우유", 1700, 30);
        Product p5 = new Product(5, "치킨", 4000, 10);
        
        //상품 등록 확인
        p1.proInfo();
        p2.proInfo();
        p3.proInfo();
        p4.proInfo();
        p5.proInfo();

        System.out.println();
        //----------------------------------------------------------------------------

        //장바구니 상품 담기
        c1.addToCart(p1, 20);
        c1.addToCart(p2, 20);
        c2.addToCart(p3, 1);
        c2.addToCart(p4, 5);

        System.out.println();

        //장바구니 상품 구매
        c1.buyCart();
        c2.buyCart();
    }
}
