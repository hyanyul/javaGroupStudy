package buy.buy1;

public class Customer {
    int id; //회원번호 변수 선언
    String name;    //회원 이름 변수 선언
    int age;    //회원 나이 변수 선언
    Product[] cart = new Product[10];

    Customer(int id, String name, int age, Product[] cart){ //회원 등록 생성자
        this.id = id;   //필드와 동일한 변수임을 알리기 위해 this(객체가 자기 자신임을 알림) 사용
        this.name = name;
        this.age = age;
        this.cart = cart;
    }

    public void cusInfo(){  //회원 등록 후 등록되었다는 메시지 출력
        System.out.printf("[회원등록] '회원번호: %d, 이름: %s, 나이: %d세'가 등록되었습니다.\n", id, name, age);
    }

    int i = 0;
    public void addToCart(Product choice, int quantity) {   //매개변수로 Product 타입 변수(선택한 물건)와 int 타입 변수(수량) 갖는 메소드 정의
        try {   //10개짜리 배열에서 크기 벗어났을 때(i>10)일 때 예외처리
            if (choice.quantity >= quantity) {  // 재고가 선택 수량보다 많거나 같을 때
                cart[i] = new Product(choice.id, choice.name, choice.price, quantity);  //cart[i]에 Product 타입의 객체 만들어서 넣음
                choice.quantity -= quantity;    //재고에서 선택 수량만큼 뺌
                System.out.printf("%s님의 장바구니에 %s를 %d개 담았습니다.\n", name,choice.name, quantity);   //장바구니에 담은 거 확인 메시지 출력
                //System.out.println("재고 확인: " + choice.quantity);  
                i++;    //cart 다음 방에 물건 넣기 위해서 i+1 해줌
            } else {    //재고 부족할 때 안내 메시지 출력
                System.out.printf("재고가 부족하여 상품을 담을 수 없습니다. 현재 재고는 %d개 입니다.\n", choice.quantity);
            }
        }catch (ArrayIndexOutOfBoundsException e){  //인덱스 벗어났을 때 안내 멘트 출력
            System.out.println("장바구니에 더 이상 상품을 담을 수 없습니다.");
        }
    }

    public void buyCart(){  //구매 메소드
        int sum = 0;    //총 금액 변수 선언
        for(int i=0; i<10; i++){    //총 금액 구하기 위한 반복 제어문
            if(cart[i] != null){    //cart[i]가 null일 경우 예외 뜨므로 null이 아닐 때만 계산
                sum += cart[i].price * cart[i].quantity;    //총 금액에 가격*개수 더함
            }
        }
        System.out.printf("결제할 금액은 총 %d원입니다.", sum);    //총 금액 안내 멘트 출력
    }

}
