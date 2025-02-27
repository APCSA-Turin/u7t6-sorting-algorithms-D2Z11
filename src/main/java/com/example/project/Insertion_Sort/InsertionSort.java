package com.example.project.Insertion_Sort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int c = 0;
        for (int i = 1; i < elements.length; i++) {
            int j = i - 1;
            int tempMoved = i;
            while (j >= 0 && elements[tempMoved] < elements[j]) {
                // System.out.println("SWAP: " + elements[j] + " and " + elements[tempMoved]);
                // System.out.println(Arrays.toString(elements));
                int temp = elements[j];
                elements[j] = elements[tempMoved];
                elements[tempMoved] = temp;
                // System.out.println(Arrays.toString(elements));
                c++;
                j--;
                tempMoved--;
                // System.out.println(elements[tempMoved] + " " + elements[j]);
            }
            // if (j != i - 1) {
            // System.out.println("SWAP: " + elements[j] + " and " + elements[i]);
            // System.out.println(Arrays.toString(elements));
            // int temp = elements[j];
            // elements[j] = elements[i];
            // elements[i] = temp;
            // System.out.println(Arrays.toString(elements));
            // }
        }
        System.out.println(c);
        return elements;
    }

    public static void selectionSort(int[] elements) {
        int c = 0;
        // Skip last element since no items after it
        for (int i = 0; i < elements.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[maxIndex]) {
                    maxIndex = j;
                }
                c++;
            }
            // swap i and j
            int temp = elements[maxIndex];
            elements[maxIndex] = elements[i];
            elements[i] = temp;
        }
        System.out.println(c);
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
        for (int i = 0; i < words.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < words.size(); j++) {
                // Check if the current word is higher in terms of lexographic/alphabet order
                if (words.get(j).compareTo(words.get(maxIndex)) < 0) {
                    maxIndex = j;
                }
            }
            // swap i and j
            String temp = words.get(maxIndex);
            words.set(maxIndex, words.get(i));
            words.set(i, temp);
            System.out.println(words);
        }
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