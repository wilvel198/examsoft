package com.examsoft;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) throws IOException {
        int argsSize = args.length;

        String fileLocation = null;
        String tempWords = "the cat is in the bag";

        //check and see if a file name was passed as a paramter
        //if file location was passed use file to count words

        if(argsSize > 0){
            fileLocation = args[0].toString();
            System.out.println("file location for word counting --> " + fileLocation);
            tempWords = getDataFromFile(fileLocation);
            countTreeMap(tempWords);
        }else
        {
            countTreeMap(tempWords);
        }
    }


    // the method takes a string containing words. the words are put in
    // lower case to make sure only unique words are counted
    // the unique words are counted and a collection is used to put them in reverse order
    // when they print
    public static void countTreeMap(String words2Count) {
       // TreeMap<String, Integer> wordCounter = new TreeMap<String, Integer>();
        TreeMap<String, Integer> wordCounter
                = new TreeMap<>(Collections.reverseOrder());
        //the words strings are put in lower case and split into an array for counting
        String[] uniqueWords = words2Count.toLowerCase().trim().split(" ");
        //default place holder to count items
        int currentItemCount = 0;

        for (String item : uniqueWords) {
            if (wordCounter.get(item) == null) {
                wordCounter.put(item.toLowerCase(), 1);
            } else {
                currentItemCount = wordCounter.get(item);
                wordCounter.put(item, currentItemCount + 1);
            }
        }

        for( Map.Entry<String, Integer> entry : wordCounter.entrySet() ){
            System.out.println(entry.getValue()  + " " + entry.getKey() );
        }
    }

    public static String getDataFromFile(String path) throws IOException {
        String wordCountInfo = "";
        try {
            FileInputStream fis = new FileInputStream(path);
             wordCountInfo = IOUtils.toString(fis, "UTF-8");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return wordCountInfo;
    }

}
