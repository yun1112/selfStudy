package fruit;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		FruitSeller seller=new FruitSeller();
		FruitBuyer buyer=new FruitBuyer();
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("거래 전");
		System.out.println("판매자 판매 현황");
		System.out.println("현재 사과 개수: "+seller.numOfApples);
		System.out.println("현재 수익: "+seller.myMoney);
		System.out.println("구매자 구매 현황");
		System.out.println("현재 사과 개수: "+buyer.numOfApples);
		System.out.println("현재 잔액: "+buyer.myMoney);
		System.out.println("---------------------");
	
		System.out.println("가격 입력");
		int price=sc.nextInt();	
		System.out.println("---------------------");
		buyer.buyApples(seller, price);
		System.out.println("거래 후");
		System.out.println("현재 사과 개수: "+seller.numOfApples);
		System.out.println("현재 수익: "+seller.myMoney);
		System.out.println("구매자 구매 현황");
		System.out.println("현재 사과 개수: "+buyer.numOfApples);
		System.out.println("현재 잔액: "+buyer.myMoney);
	}

}
