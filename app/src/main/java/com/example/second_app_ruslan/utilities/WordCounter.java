package com.example.second_app_ruslan.utilities;

public class WordCounter {
    public static int GetWordsCount(String input) {

        String[] words = input.trim().split("[\\s,.]+");

        return words.length;
    }
}
