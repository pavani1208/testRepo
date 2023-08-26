package basic;


	import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

	public class DuplicateCharacters {
	    public static void main1(String[] args) {
	        String str = "Hello, World!";
	        printDuplicateCharacters(str);
	    }

	    public static void printDuplicateCharacters(String str) {
	        // Create a map to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to character array
	        char[] characters = str.toCharArray();

	        // Iterate over each character in the array
	        for (char ch : characters) {
	            // Ignore spaces and punctuation marks
	            if (Character.isLetter(ch)) {
	                // Convert the character to lowercase
	                ch = Character.toLowerCase(ch);

	                // Update the count in the map
	                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	            }
	        }

	        // Print the duplicate characters
	        for (char ch : charCountMap.keySet()) {
	            int count = charCountMap.get(ch);
	            if (count > 1) {
	                System.out.println(ch + " : " + count);
	            }
	        }
	    }
	    
	  
	        public static void main(String[] args) {
	            String str = "Hello, World!";
	            printDuplicateCharacterss(str);
	        }

	        public static void printDuplicateCharacterss(String str) {
	            Map<Character, Integer> charCountMap = new HashMap<>();
	            Set<Character> duplicateCharacters = new HashSet<>();

	            for (char ch : str.toCharArray()) {
	                ch = Character.toLowerCase(ch);
	                if (Character.isLetter(ch)) {
	                    int count = charCountMap.getOrDefault(ch, 0) + 1;
	                    charCountMap.put(ch, count);
	                    if (count > 1) {
	                        duplicateCharacters.add(ch);
	                    }
	                }
	            }

	            for (char ch : duplicateCharacters) {
	                System.out.println(ch);
	            }
	        }
	    }

	

