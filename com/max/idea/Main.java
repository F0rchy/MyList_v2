package com.max.idea;

public class Main {
    public static void main(String[] args) {
//-----------------------------------------------------------Integer----------------------------------------------------
//        MyList<Integer> list = new MyList<> ((a, b) -> {
//            if(((int)a.getValue() - (int)b.getValue()) > 0) {
//                return 1;
//            }
//            else if (((int)a.getValue() - (int)b.getValue()) < 0) {
//                return -1;
//            }
//            else {
//                return 0;
//            }
//        });
//        Randomizer.randomInt(list, 5);
//        System.out.println(list.toString());
//        list.sort();
//        System.out.println(list.toString());
//-----------------------------------------------------------Double-----------------------------------------------------
//        MyList<Double> list = new MyList<> ((a, b) -> {
//            if(((double)a.getValue() - (double)b.getValue()) > 0) {
//                return 1;
//            }
//            else if (((double)a.getValue() - (double)b.getValue()) < 0) {
//                return -1;
//            }
//            else {
//                return 0;
//            }
//        });
//        Randomizer.randomDouble(list, 5);
//        System.out.println(list.toString());
//        list.sort();
//        System.out.println(list.toString());
//-----------------------------------------------------------String-----------------------------------------------------
        MyList<String> list = new MyList<> ((a, b) -> {
            if((a.hashCode() - b.hashCode()) > 0) {
                return 1;
            }
            else if ((a.hashCode() - b.hashCode()) < 0) {
                return -1;
            }
            else {
                return 0;
            }
        });
        Randomizer.randomString(list, 5, 5);
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());
    }
}