package fruit;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		FruitSeller seller=new FruitSeller();
		FruitBuyer buyer=new FruitBuyer();
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("�ŷ� ��");
		System.out.println("�Ǹ��� �Ǹ� ��Ȳ");
		System.out.println("���� ��� ����: "+seller.numOfApples);
		System.out.println("���� ����: "+seller.myMoney);
		System.out.println("������ ���� ��Ȳ");
		System.out.println("���� ��� ����: "+buyer.numOfApples);
		System.out.println("���� �ܾ�: "+buyer.myMoney);
		System.out.println("---------------------");
	
		System.out.println("���� �Է�");
		int price=sc.nextInt();	
		System.out.println("---------------------");
		buyer.buyApples(seller, price);
		System.out.println("�ŷ� ��");
		System.out.println("���� ��� ����: "+seller.numOfApples);
		System.out.println("���� ����: "+seller.myMoney);
		System.out.println("������ ���� ��Ȳ");
		System.out.println("���� ��� ����: "+buyer.numOfApples);
		System.out.println("���� �ܾ�: "+buyer.myMoney);
	}

}
