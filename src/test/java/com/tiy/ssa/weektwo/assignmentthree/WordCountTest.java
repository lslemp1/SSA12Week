package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weekone.assignmentone.Foo;

public class WordCountTest {

    static final Logger LOGGER = LogManager.getLogger(WordCountTest.class);
    
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
    
    
    
    
    
    WordCount counter = new WordCount();

    @Test
    public void checking() throws Exception 
    {
        BufferedReader reader = null;
        try
        {
            reader = Files.newBufferedReader(Paths.get("C:/Users/admin/workspace/SSA12Week/resources/the-complete-works.txt"));
            Charset.defaultCharset();
            
            String line;
            
            int i = 0;
            while(null != (line = reader.readLine()) && i++ < 130_000)
            {
                String[]words = line.split("\\W+");
                
                for(String word:words)
                {
                    if(!word.isEmpty())
                        this.counter.addWord(word);
                }
            }
           
        }
        
        catch(IOException iex)
        {
            System.err.println(iex);
        }
        
        finally{
            if(null!= reader)
                reader.close();
        }
        LOGGER.debug(this.counter.bottom(25));
        LOGGER.debug(this.counter.top(25));
        assertTrue(this.counter.count("juliet") < 10 );
        assertTrue(this.counter.count("thou") > 1_000 );
    }
    
//    @Test
//    public void less(){
//        final String path = "";
//                try(BufferedReader reader = Files.class.newBufferedReader(Paths.get(path));
//                        {
//                        
//                        }
//                        catch(IOException iex)
//                        {
//                            
//    }
//    
//    }

}
