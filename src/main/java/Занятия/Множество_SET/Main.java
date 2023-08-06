package Занятия.Множество_SET;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] a = new int[]{4, 5, 6};
       int [] b = new int[]{1, 2, 3};
        System.out.println("subArrays(q,b) = " + Arrays.toString(subArrays(a, b)));
    }
    public static int[] subArrays(int[] a, int[] b)
    {
        // Введите свое решение ниже
        int[] array = new int[a.length];
        if(a.length == b.length)
        {
            for(int i = 0; i<a.length; i++)
            {
                array[i]=a[i]-b[i];
            }
            return array;
        }
        else return new int[]{array[0]};
    }
}
