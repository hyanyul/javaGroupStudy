package buy.buy1;

public class Exe {
    public static void main(String[] args) {

        //회원 등록
        Customer c1 = new Customer(1, "한성지", 24, new Product[10]);   //생성자 통해 c1 객체 생성
        Customer c2 = new Customer(2, "홍길동", 25, new Product[10]);
        Customer c3 = new Customer(3, "김길동", 40, new Product[10]);

        c1.cusInfo();   //생성한 c1의 정보 출력하는 메소드 호출
        c2.cusInfo();
        c3.cusInfo();

        System.out.println();
        //-------------------------------------------------------------------------------------------------
        
        //상품 등록
        Product p1 = new Product(1, "빼빼로", 1500, 100);  //생성자 통해 p1 객체 생성
        Product p2 = new Product(2, "치킨", 4000, 20);
        Product p3 = new Product(3, "사이다", 2000, 40);
        Product p4 = new Product(4, "포카칩", 1700, 30);
        Product p5 = new Product(5, "츄파츕스", 200, 150);

        p1.proInfo();   //생성한 객체 p1의 정보 출력하는 메소드 호출
        p2.proInfo();
        p3.proInfo();
        p4.proInfo();
        p5.proInfo();

        System.out.println();
        //------------------------------------------------------------------------------------------------

        //장바구니에 물건 담기
        c1.addToCart(p1, 12);   //c1(한성지)의 장바구니에 물건 담음
        c1.addToCart(p2, 2);
        c1.addToCart(p4,2);
        c1.addToCart(p3, 40);
        c1.addToCart(p3, 1);

        System.out.println();
        //------------------------------------------------------------------------------------------------

        //장바구니에 담긴 물건 구매
        c1.buyCart();
    }
}
