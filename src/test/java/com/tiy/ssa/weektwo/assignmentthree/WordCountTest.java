package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

    static String SOURCE = "CONTENT CONTENT CONTENT OF OF OF WIKIPEDIA WIKIPEDIA WIKIPEDIA " + "WIKIPEDIA WIKIPEDIA"
            + " PARAGRAPHS GO GO GO GO GO GO GO GO GO HERE HERE";
    WordCount wordCount = new WordCount();

    @Before
    public void parse() {
        this.wordCount = new WordCount();
        String[] words = SOURCE.split("\\W+"); // should take care of
                                               // punctuation and other special
                                               // characters
        for (String word : words) {
            this.wordCount.addWord(word);
        }

    }

    @Test
    public void testTop() {
        assertTrue(wordCount.top(2).equals(Arrays.asList("GO", "WIKIPEDIA")));
    }

    @Test
    public void testBottom() {
        assertTrue(wordCount.bottom(2).equals(Arrays.asList("PARAGRAPHS", "HERE")));
    }

}
