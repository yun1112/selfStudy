package self;

import java.util.ArrayList;
import java.util.Scanner;

public class findMaxMin {

	public static void main(String[] args) {
		findMax f_max = new findMax();
		findMin f_min = new findMin();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max,min;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		max=f_max.findingMax(arr);
		min=f_min.findingMin(arr);
		System.out.println(min+" "+max);
	}

}
