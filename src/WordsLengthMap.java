import java.util.TreeMap;

public class WordsLengthMap {
    public static void main(String[] args) {
        // Create a TreeMap to store words as keys and their lengths as values
        TreeMap<String, Integer> wordsMap = new TreeMap<>();

        // Add words to the map
        wordsMap.put("apple", "apple".length());
        wordsMap.put("banana", "banana".length());
        wordsMap.put("cherry", "cherry".length());
        wordsMap.put("date", "date".length());
        wordsMap.put("elderberry", "elderberry".length());

        // Print the TreeMap to observe the sorted order of keys
        System.out.println(wordsMap);
    }
}
