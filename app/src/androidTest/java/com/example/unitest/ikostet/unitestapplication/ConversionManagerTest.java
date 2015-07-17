package com.example.unitest.ikostet.unitestapplication;

import junit.framework.TestCase;

public class ConversionManagerTest extends TestCase {

    String myWord, result;

    protected void setUp() throws Exception {
        myWord = "APPLE";
    }

    public void testGetHexCode() {
        result = CoversionManager.getHexCode(myWord);
        assertEquals(result, "%41%50%50%4c%45");
    }
}