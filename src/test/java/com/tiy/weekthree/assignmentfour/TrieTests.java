package com.tiy.weekthree.assignmentfour;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

//import com.tiy.ssa.weekthree.assignmentfour.Trie;

public class TrieTests
{
    Scanner in;
    String filePath;

    @Test
    public void test() throws FileNotFoundException
    {
        Trie t = new Trie();
        filePath = "C:/Users/admin/workspace/SSA12Week/resources/corncob_lowercase.txt";
        in = new Scanner(new File(filePath));

        while (in.hasNext())
        {
            String currentWord = in.next();
            t.addWord(currentWord);
        }

        assertTrue(t.contains("apple"));
        assertTrue(t.contains("computer"));
        assertTrue(t.contains("key"));
        assertTrue(t.remove("apple"));

        t.suggest("286");
        //t.suggest("3");

        t.clear();
        assertFalse(t.contains("can"));

    }

}
