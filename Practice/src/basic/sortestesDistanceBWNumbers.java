package basic;

import java.util.ArrayList;
import java.util.List;

public class sortestesDistanceBWNumbers {
	public static void main(String[] args) {
		
		int[] number = { 3,6, 13, 91, 22,25,92 };
		List<Integer> numList1 = new ArrayList<>();
		List<Integer> numList2 = new ArrayList<>();
		int minDis = Integer.MAX_VALUE;
		for (int i = 0; i < number.length - 1; i++) {

			for (int j = i + 1; j < number.length - 1; j++) {

				int diff = Math.abs(number[i] - number[j]);
				if (diff < minDis) {

					minDis = diff;

					numList1.clear();

					numList2.clear();
					numList1.add(number[i]);
					numList2.add(number[j]);

				} else if (diff == minDis) {

					numList1.add(number[i]);
					numList2.add(number[j]);

				}
			}

		}
		for (int i = 0; i < numList1.size(); i++) {
			System.out.println(numList1.get(i) +" and "+ numList2.get(i));

		}
	}
}
