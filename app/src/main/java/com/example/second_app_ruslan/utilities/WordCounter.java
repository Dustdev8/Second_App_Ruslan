package com.example.second_app_ruslan.utilities;

public class WordCounter {
    public static int GetWordsCount(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("[\\s,.]+");
        return words.length;
    }
}
