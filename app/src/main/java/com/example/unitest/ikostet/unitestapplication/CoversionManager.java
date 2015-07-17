package com.example.unitest.ikostet.unitestapplication;

public class CoversionManager {

    public static String getHexCode(String stringToHex) {
        String stringHex = "";
        char[] charArray = stringToHex.toCharArray();

        for (int i = 0; i < stringToHex.length(); i++) {
            stringHex = stringHex + "%" + String.format("%x", (int) charArray[i]);
        }
        return stringHex;
    }
}
