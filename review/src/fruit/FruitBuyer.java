package fruit;

public class FruitBuyer {
	//�Һ���
	//FruitBuyer�� �Ӽ�(�������)
	//1.������ ��� ����
	//2.�ܾ�
	int numOfApples=0;
	int myMoney=2000;//���� �� �ܾ�
	
	//FruitBuyer�� ���(�޼���)
	//1.������ ��� ����(������)
	//2.���� �� �ܾ�
	public void buyApples(FruitSeller seller,int money) {
		numOfApples+=money/seller.saleApples(money);//������ ��� ����
		myMoney-=money;
	}
	
}
