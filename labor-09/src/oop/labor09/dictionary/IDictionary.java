package oop.labor09.dictionary;

public interface IDictionary {
    String DICTIONARY_FILE = "dictionary.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
