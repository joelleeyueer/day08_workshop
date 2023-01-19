package nus;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public ArraySort() {
    }

    public void sortString(){
        String[] name = { "joel", "nadia", "leon", "darren", "faiz", "nic", "kenneth", "elizabeth", "shane", "jay"};

        System.out.println("Unsorted array: " + Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("Sorted array: " + Arrays.toString(name));
    }

    public void sortNumbers(){
        Integer[] numbers = {10, 999 ,2312, 232, 8857, 198, 192};

        Arrays.sort(numbers);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted in reverse numbers: " + Arrays.toString(numbers));

    }

}
