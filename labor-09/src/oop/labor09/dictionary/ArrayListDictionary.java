package oop.labor09.dictionary;

import java.awt.desktop.PreferencesEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

import static oop.labor09.dictionary.IDictionary.DICTIONARY_FILE;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words = new ArrayList<>();
    private static ArrayListDictionary instance = null;

    private ArrayListDictionary() {
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                add(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static IDictionary newInstance()
    {
        if(instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if(!find(word)) {
            words.add(word);
            return false;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }

}
