package com.example.project.Selection_Sort;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        words = SelectionSort.selectionSortWordList(words);
        boolean pass = true;
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).compareTo(words.get(i - 1)) < 0) { // not in alphabetical order
                pass = false;
                System.out.println(words.get(i));
                break;
            }
        }
        System.out.println(pass);
    }
}