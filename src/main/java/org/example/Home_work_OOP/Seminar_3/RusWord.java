package org.example.Home_work_OOP.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RusWord extends RusGame {
    List<String> generateRusCharList() {
        List<String> alphabetRus = new ArrayList<>(Arrays.asList("а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","ч","ц","щ","ъ","ы","ь","э","ю","я"));
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= alphabetRus.size() - 1; i++) {
            result.add(alphabetRus.get(i));
        }
        return result;
    }
}
