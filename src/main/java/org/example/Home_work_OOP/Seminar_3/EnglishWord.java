package org.example.Home_work_OOP.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishWord extends EngGame{
    @Override
    List<String> generateEngCharList() {
        List<String> alphabetEng = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"));
        List<String>  result = new ArrayList<>();
        for (int i = 0; i <= alphabetEng.size()-1; i++) {
            result.add(alphabetEng.get(i));
        }
        return result;
    }
}
