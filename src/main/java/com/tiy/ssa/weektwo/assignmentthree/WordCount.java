package com.tiy.ssa.weektwo.assignmentthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    final Map<String, Integer> wordCount = new HashMap<String, Integer>();
    final List<String> words = new ArrayList<>();
    

    /**
     * 
     * @param word
     *            callers are responsible for ensuring <code>word</code> <br>
     *            is an actual word, parsing is done by the caller
     */
    public void addWord(String word) {

        if (wordCount.containsKey(word)) {
            wordCount.replace(word, wordCount.get(word) + 1);
        } else {
            wordCount.put(word, 1);
        }
        words.add(word);
    }

    public int count(String word) {
        return wordCount.getOrDefault(word,0);
    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in descending popularity order, so
     *         top <code>many</code> words
     */
    public List<String> top(int many) {

        ArrayList<String> mostFrequent = new ArrayList<String>();

        for (String s : words) {
            Integer frequency = wordCount.get(s);
            if (frequency == null)
                frequency = 1;
            else
                frequency++;
            wordCount.put(s, frequency);
        }

        ArrayList<Integer> top = new ArrayList<Integer>();
        top.addAll(wordCount.values());
        Collections.sort(top, Collections.reverseOrder());
        int j = -1;

        for (Integer i : top.subList(0, many)) {
            if (j == i)
                continue;
            j = i;

            for (String s : wordCount.keySet()) {
                if (wordCount.get(s) == i)
                    mostFrequent.add(s);
            }
        }
        return mostFrequent;
    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in ascending least popularity
     *         order, so bottom <code>many</code> words
     */
    public List<String> bottom(int many) {

        List<String> leastFrequent = new ArrayList<String>();
        List<Map.Entry<String, Integer>> bottom = new ArrayList<Map.Entry<String, Integer>>(wordCount.entrySet());

        Collections.sort(bottom, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
                return (second.getValue()).compareTo(first.getValue());
            }
        });

        for (Map.Entry<String, Integer> s : bottom) {
            leastFrequent.add(s.getKey());
        }

        Collections.reverse(leastFrequent);

        return leastFrequent.subList(0, many);

    }

    /**
     *
     * @return the input that is being word counted (maintaining the order
     *         prescribed by {@link #addWord(String) }
     * @see #addWord(String)
     */
    public String source() {
        return String.join(" ", words);

    }

}