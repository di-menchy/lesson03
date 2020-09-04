package com.company.util;

public class Checker {

        public boolean isEven(int number) {  // четное

            if (Math.abs(number % 2) > 0)
                return false;
            else
                return true;
        }


            public boolean isOdd(int number) {   //нечетное
                if (Math.abs(number % 2) > 0)
                    return true;
                else
                    return false;
            }
        }