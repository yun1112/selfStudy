package self;

import java.util.ArrayList;

public class findMin {
	// 속성(멤버변수)

	// 기능(메서드)
	public int findingMin(ArrayList<Integer> arr) {
		int min = 1000000;
		for (int i = 0; i < arr.size(); i++) {
			if (min > arr.get(i))
				min = arr.get(i);
		}
		return min;
	}
}
