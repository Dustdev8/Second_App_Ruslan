package com.example.second_app_ruslan.utilities;

public class SpaceRemover {
    public static String removeExcessiveSpaces(String input) {
        // Trim leading and trailing spaces
        input = input.trim();

        // Replace multiple spaces with a single space
        return input.replaceAll("\\s+", " ");
    }
}