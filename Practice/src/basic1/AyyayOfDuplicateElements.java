package basic1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AyyayOfDuplicateElements{
   
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana"};
        
        
        // Group the elements by their occurrences
       // Map<String, Long> duplicates =
        		Arrays.stream(array)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " count " + entry.getValue()));

                
        
    /*    // Filter elements that have more than one occurrence
        String[] duplicateElements = duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
        
        // Print the duplicate elements
        System.out.println("Duplicate elements: " + Arrays.toString(duplicateElements));
        */
        
//-------------------------------------------------------------------------------------
        		System.out.println("--------------------------------------");
        		int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 1};

        		Arrays.stream(arr)
        		    .boxed()
        		    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        		    .entrySet()
        		    .stream()
        		    .filter(entry -> entry.getValue() > 1)
        		    .forEach(entry -> System.out.println(entry.getKey() + " count " + entry.getValue()));

        		   // .map(Map.Entry::getKey)
        		   // .forEach(System.out::println);
        		
        		
        		//--------------------------------------------- another way of implementation of int array

        		/* int[] arr1 = {1, 2, 3, 4, 2, 5, 6, 3, 1};

        	     Map<Integer, Long> duplicates = Arrays.stream(arr1)
        	             .boxed()
        	             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        	             .entrySet()
        	             .stream()
        	             .filter(entry -> entry.getValue() > 1)
        	             .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        	     duplicates.forEach((value, count) -> System.out.println(value + " - Count: " + count));
        	     */
        		
    }
    
}
