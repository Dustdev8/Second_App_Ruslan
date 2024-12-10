package com.example.second_app_ruslan;

import com.example.second_app_ruslan.utilities.CharCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharCounterTest {
    @Test
    public void testGetCharsCount() {
        assertEquals(0, CharCounter.GetCharsCount(""));
        assertEquals(5, CharCounter.GetCharsCount("Hello"));
        assertEquals(14, CharCounter.GetCharsCount("This is a test"));
        assertEquals(11, CharCounter.GetCharsCount("12345 67890"));
    }
}