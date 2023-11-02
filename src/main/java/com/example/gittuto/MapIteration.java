package com.example.gittuto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {
        Map<String,Integer> integerMap = new HashMap<>();
        integerMap.put("Test",1);
        integerMap.put("Test2",2);
        Set<Map.Entry<String,Integer>> entries = integerMap.entrySet();
        for (Map.Entry<String,Integer> entry : entries){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }
    }
}
