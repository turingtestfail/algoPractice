package com.customerrealty.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer>input;
        input = Arrays.asList(new Integer[]{5, 3, 6, 2, 10, 9});
        selectionSort(input);
    }

    private static void selectionSort(List<Integer> input) {
        ArrayList<Integer>out = new ArrayList<>();
        int smallest_index=0;
        for(int i=0;i<input.size();i++){
            smallest_index = findSmallest(input);
            out.add(smallest_index);
            input.remove(smallest_index);
        }
    }

    private static int findSmallest(List<Integer> input) {
        Integer smallest = input.get(0);
        int smallest_index = 0;
        for(int j=1;j<input.size();j++){
            if(input.get(j)<smallest){
                smallest = input.get(j);
                smallest_index = j;
            }
        }
        return smallest_index;
    }
}
