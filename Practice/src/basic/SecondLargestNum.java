package basic;

public class SecondLargestNum {
public static void main1(String[] args) {
	
	  int a [] = {1,3,2,4,7,6};
    //int k = a.length;
	int temp;  
	for (int i = 0; i < a.length; i++)   // i=0
	        {  
	            for (int j = i + 1; j < a.length; j++)   
	            {  
	                if (a[j] > a[i])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        } 
	/*  1 3 2 4 7 6
	3 1 2 4 7 6
	4 1 2 3 7 6
	7 1 2 3 4 6
	7 2 1 3 4 6
	7 3 1 2 4 6
	7 4 1 2 3 6
	7 6 1 2 3 4
	*/
	System.out.println(a[2]); // descending oder {7 6 1 2 3 4}
	//System.out.println(a[a.length-2]);
	
}

	    
public static void main(String[] args) {
    int[] a = {1,8, 3, 2, 4, 7, 6, 1, 2, 7,8};
    int highest = Integer.MIN_VALUE;  // Initialize highest as the lowest possible value
    int secondHighest = Integer.MIN_VALUE;  // Initialize second highest as the lowest possible value

    for (int i = 0; i < a.length; i++) {
        if (a[i] > highest) {
            // Current element is greater than highest
            secondHighest = highest;
            highest = a[i];
        } else if (a[i] > secondHighest && a[i] != highest) {
            // Current element is greater than second highest but not equal to highest
            secondHighest = a[i];
        }
    }

    System.out.println("Second highest number: " + secondHighest);
}
}
