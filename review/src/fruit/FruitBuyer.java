package fruit;

public class FruitBuyer {
	//소비자
	//FruitBuyer의 속성(멤버변수)
	//1.구매할 사과 개수
	//2.잔액
	int numOfApples=0;
	int myMoney=2000;//구매 전 잔액
	
	//FruitBuyer의 기능(메서드)
	//1.구매한 사과 개수(증가량)
	//2.구매 후 잔액
	public void buyApples(FruitSeller seller,int money) {
		numOfApples+=money/seller.saleApples(money);//구매한 사과 개수
		myMoney-=money;
	}
	
}
