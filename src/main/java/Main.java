// project 10 Count Occurrence of Words in text   --Begin Coding Fast   https://www.youtube.com/watch?v=OwhsObNvwVQ&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=10
/*
  1. create 'Content' class
  2. 'Content' object to store input String
  3. count occurrences of a given word
        a. trim the String
        b. search for matches at beginning and end
        c. search for words surrounded by space
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  System.out.println("enter a phrase, sentence, paragraph, or passage: ");
  Scanner scanny = new Scanner(System.in);
  String inputString = scanny.nextLine();
  System.out.println("please enter the word to search for: ");
  String inputWord = scanny.nextLine();
  scanny.close();

  Content inputContent = new Content(inputString);
  String word = inputWord;
  System.out.println(word + ": " + inputContent.getCount(word));
 }
}