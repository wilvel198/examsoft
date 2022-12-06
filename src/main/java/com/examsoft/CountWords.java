package com.examsoft;

public class CountWords {

    public static void main(String[] args) {
        System.out.println("----------> Testing word count <----------------");

        String tempWords = "I am the way to the light and I am the path way from darkness. " +
                "I will see you in the other side";

        countWords(tempWords);


    }


    public static void countWords(String words2Count){
        String[] uniqueWords = words2Count.trim().split(" ");

        System.out.println(uniqueWords.length);


    }


}
