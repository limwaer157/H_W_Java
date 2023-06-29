package Занятия.Множество_SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(12);
        set.add(121);
        set.add(13);
        set.add(25);
        set.add(643);
        set.add(14);
        set.remove(1);
        int qwer = set.size();
        System.out.println(set);
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,5,6,7));
        System.out.println(a);


    }
}
