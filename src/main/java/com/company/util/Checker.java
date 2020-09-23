package com.company.util;

public class Checker {
    public boolean isEven(int number) {  // четное

        if (number % 2 == 0)
            return true;
        else
            return false;
    }


    public boolean isOdd(int number) {   //нечетное
        if (number % 2 != 0)
            return true;
        else
            return false;
    }
}
