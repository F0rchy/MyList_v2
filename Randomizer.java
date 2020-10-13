package com.max.idea;

import java.util.Collection;

public class Randomizer {
    public static boolean randomInt(Collection<Integer> collection, long numbers) {
        if (numbers <= 0) {
            return false;
        }
        for (int i = 0 ; i < numbers ; ++i) {
            collection.add((int)(Math.random() * 100));
        }
        return true;
    }

    public static boolean randomDouble(Collection<Double> collection, long numbers) {
        if (numbers <= 0) {
            return false;
        }
        for (int i = 0 ; i < numbers ; ++i) {
            collection.add((double)(Math.random() * 10));
        }
        return true;
    }
}
