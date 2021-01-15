package level01;

import java.util.*;

public class SortingWords {
    private Map<Character, List<String>> map;

    public SortingWords() {
        map = new HashMap<>();
    }

    public List<String> solution(String[] inputs, int index) {
        map = setMap(inputs, index);
        sortValues();
        return convertMapToList(getSortedKeys());
    }

    public Map<Character, List<String>> setMap(String[] inputs, int index) {
        Map<Character, List<String>> map = new HashMap<>();
        for (String s : inputs) {
            char ch = s.charAt(index);
            if (map.containsKey(ch))
                map.get(ch).add(s);
            else {
                List<String> words = new ArrayList<>();
                words.add(s);
                map.put(ch, words);
            }
        }
        return map;
    }

    public void sortValues() {
        for (char c : map.keySet())
            Collections.sort(map.get(c));
    }

    public List<Character> getSortedKeys() {
        List<Character> sortedCharacter = new ArrayList<>(map.keySet());
        Collections.sort(sortedCharacter);
        return sortedCharacter;
    }

    public List<String> convertMapToList(List<Character> sortedCharacter) {
        List<String> convertedList = new ArrayList<>();
        for (char c : sortedCharacter)
            convertedList.addAll(map.get(c));
        return convertedList;
    }

    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        String[] str2 = {"abce", "abcd", "cdx"};
        SortingWords sortingWords = new SortingWords();
        for (String s : sortingWords.solution(str, 1))
            System.out.print(s + " ");
        System.out.println();
        for (String s : sortingWords.solution(str2, 2))
            System.out.print(s + " ");
    }
}