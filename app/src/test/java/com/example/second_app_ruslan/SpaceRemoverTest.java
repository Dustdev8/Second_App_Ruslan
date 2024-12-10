package com.example.second_app_ruslan;

import com.example.second_app_ruslan.utilities.SpaceRemover;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpaceRemoverTest {
    @Test
    public void testRemoveExcessiveSpaces() {
        assertEquals("Some Text with extra spaces", SpaceRemover.removeExcessiveSpaces("Some     Text with extra        spaces"));
        assertEquals("123 1", SpaceRemover.removeExcessiveSpaces("123  1"));
        assertEquals("123", SpaceRemover.removeExcessiveSpaces("  123  "));
        assertEquals("123 456", SpaceRemover.removeExcessiveSpaces("123   456"));
    }
}