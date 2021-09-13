package com.customerrealty.search;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer>input=List.of(1,2,3,4,5,6);
        int item = 4;
        search(input,item);
    }

    public static Integer search(List input, int item){
        int low = 0;
        int high = input.size()-1;

        while(low<=high){
            int mid = (low+high)/2;
            int guess = (Integer)input.get(mid);
            if(guess==item){
                return mid;
            }
            if(guess>item){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return null;
    }
}
