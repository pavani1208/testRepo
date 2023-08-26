package basic1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class longString {
public static void main(String[] args) {
	 String longString1 = "This is a long string with repeated words. This string has some words that are repeated multiple times.";

     // Step 1: Split the string into words
    // String[] words1 = longString1.split(" ");
     String[] words1 = longString1.split("[^a-zA-Z]+");
     
     Arrays.stream(words1)
     .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
     .entrySet().stream()
     .filter(entry -> entry.getValue() > 1)
     .forEach(entry -> System.out.println(entry.getKey() + " count " + entry.getValue()));
     
     System.out.println("--------------------------------------------------------------------");
     
     
     String longString = "This is a long string with repeated words. This string has some words that are repeated multiple times.";

     // Step 1: Split the string into words
    // String[] words = longString.split(" ");
     String[] words = longString.split("[^a-zA-Z]+");
     // Step 2: Create a HashMap to store word frequencies
     HashMap<String, Integer> wordFrequencies = new HashMap<>();

     // Step 3: Count word frequencies
     for (String word : words) {
         if (wordFrequencies.containsKey(word)) {
             int frequency = wordFrequencies.get(word);
             wordFrequencies.put(word, frequency + 1);
         } else {
             wordFrequencies.put(word, 1);
         }
     }

     // Step 4: Print repeated words
     for (String word : wordFrequencies.keySet()) {
         int frequency = wordFrequencies.get(word);
         if (frequency > 1) {
             System.out.println(word + " - Frequency: " + frequency);
         }
     }
}
}
