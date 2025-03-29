package src.Strings;

import java.util.*;
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            sb.append(String.valueOf(c).repeat(freqMap.get(c)));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "tree";
        System.out.println(frequencySort(input));
    }
}

