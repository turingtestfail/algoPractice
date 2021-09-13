package com.customerrealty.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Greedy {
    public static void main(String[]args){
        Set<String> kone = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> ktwo = new HashSet<>(Arrays.asList("d", "e", "f"));
        Set<String> kthree = new HashSet<>(Arrays.asList("g", "f", "c"));

    }

    public Set<String>getFinalStations(Set<String>statesNeeded, HashMap<String,Set<String>> stations){
        Set<String>finalStations = new HashSet<>();
        while(!statesNeeded.isEmpty()){
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();
            for(Map.Entry<String,Set<String>> entry : stations.entrySet()){
                Set<String> intersection = new HashSet<String>(statesNeeded);
                intersection.retainAll(entry.getValue());
                if(intersection.size()>statesCovered.size()){
                    bestStation = entry.getKey();
                    statesCovered = intersection;
                }
            }
            statesNeeded.removeAll(statesCovered);
            finalStations.add(bestStation);
        }
        return finalStations;
    }
}
