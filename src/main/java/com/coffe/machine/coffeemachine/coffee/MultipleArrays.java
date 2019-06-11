package com.coffe.machine.coffeemachine.coffee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleArrays {
    private static Map<Integer, Integer> countArraysMap = new HashMap<>();
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{2,2, 3, 5}, {12, 3, 5}, {2, 13, 5}, {2, 3, 5}};
        for (int i = 0; i < 4; i++) {
            int[] arrs = new int[3];
            for (int j = 0; j < arrays[i].length; j++) {
                arrs[j] = arrays[i][j];
            }
            handleArrays(arrs);
        }
        List<Integer> duplicates = findDuplicateNumbers(4);
        System.out.println();
    }
    public static void handleArrays(int[] arr) {
        Map<Integer, Integer> countHandleArrayMap = new HashMap<>();
        countArray(arr, countHandleArrayMap);
        updateCountAarraysMap(countHandleArrayMap);
    }
    public static void countArray(int[] arr, Map<Integer, Integer> countHandleArrayMap) {

        for (int i = 0; i < arr.length; i++) {
            if (countHandleArrayMap.get(arr[i]) == null) {
                countHandleArrayMap.put(arr[i], 1);
            }
        }
    }
    public static void updateCountAarraysMap(Map<Integer, Integer> countHandleArrayMap) {
        for (Map.Entry<Integer, Integer> entry : countHandleArrayMap.entrySet()) {
            if (countArraysMap.get(entry.getKey()) == null) {
                countArraysMap.put(entry.getKey(), 1);
            } else {
                countArraysMap.put(entry.getKey(), countArraysMap.get(entry.getKey()) + 1);
            }
        }
    }
    public static List<Integer> findDuplicateNumbers(int numberOfArrays) {
        List<Integer> duplicateArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countArraysMap.entrySet()) {
            if (entry.getValue() == numberOfArrays) duplicateArr.add(entry.getKey());
        }
        return duplicateArr;
    }
}
