package com.example;

import java.util.HashMap;
import java.util.Map;

public class ShapeUtils {

    public static boolean areAllSidesPositives(int... sides) {
        for (int side : sides) {
            if (isNegative(side) || isZero(side)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNegative(int side) {
        return side < 0;
    }

    private static boolean isZero(int side) {
        return side == 0;
    }

    public static boolean areAllSidesEquals(int... sides) {
        return howManyEqualsSideItHas(sides) == sides.length;
    }

    public static boolean areAllSidesDifferent(int... sides) {
        return howManyEqualsSideItHas(sides) == 0;
    }

    public static int howManyEqualsSideItHas(int... sides) {
        Map<Integer, Integer> sideToOccurrencesMap = countOccurrencesFromEachSide(sides);

        int equalsSides = 0;
        for (Map.Entry<Integer, Integer> sidesAndOccurrences : sideToOccurrencesMap.entrySet()) {
            int occurrencesTimes = sidesAndOccurrences.getValue();
            if (occurrencesTimes > 1) {
                equalsSides += occurrencesTimes;
            }

        }
        return equalsSides;
    }

    public static Map<Integer, Integer> countOccurrencesFromEachSide(int[] sides) {
        Map<Integer, Integer> sideToOccurrencesMap = new HashMap<>();

        for (int side : sides) {
            int sideOccurrences = 1;
            if (sideToOccurrencesMap.containsKey(side)) {
                sideOccurrences = sideToOccurrencesMap.get(side) + 1;
            }
            sideToOccurrencesMap.put(side, sideOccurrences);
        }
        return sideToOccurrencesMap;
    }

}
