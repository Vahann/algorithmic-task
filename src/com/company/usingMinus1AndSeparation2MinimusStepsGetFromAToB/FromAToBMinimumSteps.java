package com.company.usingMinus1AndSeparation2MinimusStepsGetFromAToB;

public class FromAToBMinimumSteps {

    public static int mapNumber(int a, int b) {

        int startNumber = a;
        if (startNumber != b && startNumber % 2 == 0 && startNumber / 2>b) {
            startNumber = startNumber / 2;
        } else {
            startNumber = startNumber - 1;
        }
        if (startNumber != b) {
           return mapNumber(startNumber, b);
        }
        return startNumber;
    }
}
