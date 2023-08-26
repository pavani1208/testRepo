package basic;

import java.util.Arrays;

public class ArraysCoding {
public static void main(String[] args) {
	int num [] = {2,6, 3,11,9};
		
	int [] sortedArray = Arrays.stream(num).sorted().toArray();
	System.out.println(Arrays.toString(sortedArray));

}
}
