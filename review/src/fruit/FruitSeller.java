package fruit;

public class FruitSeller {
	//�Ǹ���
	//1.���� ����(���)
	//2.��� ����
	//3.����
	
	//FruitSeller�� �Ӽ�(�������)
	final int APPLE_PRICE=1000;//������� 1000�� ����(���)
	int numOfApples=20;//���� 20�� ����(�ʱ�ȭ)
	int myMoney=0;//���� ���� ����
	
	//Fruit�� ���(�޼���)
	//������ �Է��ϸ�, �Ǹ��� ��� ���� ��ȯ
	//�޼��� ȣ�� �� ���ϴ� ������� ��
	//1.��� ����s
	//2.����
	public int saleApples(int money) {
		int num=money/APPLE_PRICE;//�Ǹ��� ��� ����
		numOfApples-=num;//�Ǹ� �� ���� ��� ����
		myMoney+=money;//���� �߻�
		return num;
	}
}
