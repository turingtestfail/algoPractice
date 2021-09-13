package com.customerrealty.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer>input;
        input = Arrays.asList(new Integer[]{5, 3, 6, 2, 10, 9});
        quickSort(input);
    }

    private static List<Integer> quickSort(List<Integer> input) {
        if(input.size()<2){
            return input;
        }else{
            Integer pivot = input.get(0);
            List<Integer>slice = input.subList(1,input.size());
            List<Integer>less = new ArrayList<>();
            List<Integer>more = new ArrayList<>();
            for(Integer ig:slice){
                if(ig<=pivot){
                    less.add(ig);
                }else{
                    more.add(ig);
                }
            }
            quickSort(less).add(pivot);
            less.addAll(quickSort(more));
            return less;
        }
    }


}
