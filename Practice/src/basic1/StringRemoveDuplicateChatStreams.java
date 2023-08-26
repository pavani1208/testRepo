package basic1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRemoveDuplicateChatStreams {
public static void main(String[] args) {
	
	String str1 = "your_string_here";

	Map<Character, Integer> charCountMap = new HashMap<>();

	for (char ch : str1.toCharArray()) {
	    ch = Character.toLowerCase(ch);
	    if (Character.isLetter(ch)) {
	        charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	    }
	}

	charCountMap.entrySet().stream()
	    .filter(entry -> entry.getValue() > 1)
	    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
System.out.println("--------------------------------------------------");
	
	String str = "pavani";

	str.chars()
	    .map(Character::toLowerCase)
	    .filter(Character::isLetter)
	    .boxed()
	    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	    .entrySet()
	    .stream()
	    .filter(entry -> entry.getValue() > 1)
	    .map(Map.Entry::getKey)
	    .map(ch -> (char) ch.intValue())
	   .forEach(System.out::println);
}
public static void printDuplicateCharacters(String str) {
    // Create a HashMap to store characters and their counts
    Map<Character, Integer> charCountMap = new HashMap<>();

    // Convert the string to a character array
    char[] characters = str.toCharArray();

    // Iterate over each character in the array
    for (char c : characters) {
    	//c = Character.toLowerCase(c);
        if (Character.isLetter(c)) {
    	
        // If the character is already present in the map, increment its count
        if (charCountMap.containsKey(c)) {
            charCountMap.put(c, charCountMap.get(c) + 1);
        } else {
            // Otherwise, add the character to the map with count 1
            charCountMap.put(c, 1);
        }
       }
    }

    // Iterate over the map entries and print the characters with count > 1
  /*  for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }*/
    charCountMap.entrySet().stream()
    .filter(entry -> entry.getValue() > 1)
    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
}

public static void main1(String[] args) {
    String str = "Hello, World!!HW";
    System.out.println("Duplicate characters in the string:");
    printDuplicateCharacters(str);
    
    // ----------
   
}
}
