package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
              for (int j = 0; j < i; j++) {
                if (elements[j] > elements[i]) {
                    int temp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = temp;
                }
              }
        }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < i; j++) {
              if (words.get(j).compareTo(words.get(i)) > 0) {
                  String temp = words.get(j);
                  words.set(j, words.get(i));
                  words.set(i, temp);
              }
            }
      }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}