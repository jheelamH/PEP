import java.util.TreeMap;

public class WordsLengthMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordsMap = new TreeMap<>();

        wordsMap.put("apple", "apple".length());
        wordsMap.put("banana", "banana".length());
        wordsMap.put("cherry", "cherry".length());
        wordsMap.put("date", "date".length());
        wordsMap.put("elderberry", "elderberry".length());

        System.out.println(wordsMap);
    }
}
