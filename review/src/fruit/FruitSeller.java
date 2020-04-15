package fruit;

public class FruitSeller {
	//판매자
	//1.과일 가격(상수)
	//2.사과 개수
	//3.수익
	
	//FruitSeller의 속성(멤버변수)
	final int APPLE_PRICE=1000;//사과가격 1000원 고정(상수)
	int numOfApples=20;//현재 20개 있음(초기화)
	int myMoney=0;//현재 수익 없음
	
	//Fruit의 기능(메서드)
	//가격을 입력하면, 판매한 사과 개수 반환
	//메서드 호출 후 변하는 멤버변수 값
	//1.사과 개수s
	//2.수익
	public int saleApples(int money) {
		int num=money/APPLE_PRICE;//판매한 사과 개수
		numOfApples-=num;//판매 후 남은 사과 개수
		myMoney+=money;//수익 발생
		return num;
	}
}
