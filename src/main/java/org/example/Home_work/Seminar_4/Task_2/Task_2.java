package org.example.Home_work.Seminar_4.Task_2;

import java.util.*;

//Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
//Входная строка действительна, если:
//Открытые скобки должны быть закрыты однотипными скобками.
//Открытые скобки должны быть закрыты в правильном порядке.
//Каждой закрывающей скобке соответствует открытая скобка того же типа.
public class Task_2 {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        String s = "(){}[";
        char[] x = s.toCharArray();
        boolean flag = isValid(deque, x);
        System.out.println(flag);
    }

    private static boolean isValid(Deque<Character> deque, char[] x) {
        boolean flag = true;
        for (Character str : x) {
            if (str == '(' || str == '{' || str == '[') {
                deque.push(str);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                if (str == ')' && deque.peek() == '(') {
                    deque.pop();
                } else if (str == '}' && deque.peek() == '{') {
                    deque.pop();
                } else if (str == ']' && deque.peek() == '[') {
                    deque.pop();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}