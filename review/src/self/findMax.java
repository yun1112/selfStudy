package self;

import java.util.ArrayList;

public class findMax {
	// �Ӽ�(�������)
	// ���(�޼���)
	public int findingMax(ArrayList<Integer> arr) {
		int max = -1000000;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > max)
				max = arr.get(i);
		}
		return max;
	}
}
