package com.example.second_app_ruslan;

import com.example.second_app_ruslan.utilities.WordCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    @Test
    public void testGetWordsCount() {
        assertEquals(0, WordCounter.GetWordsCount(""));
        assertEquals(1, WordCounter.GetWordsCount("Hello"));
        assertEquals(4, WordCounter.GetWordsCount("This is a test"));
        assertEquals(2, WordCounter.GetWordsCount("12345 67890"));
        assertEquals(4, WordCounter.GetWordsCount("This is a, test.")); // Handles punctuation
    }
}