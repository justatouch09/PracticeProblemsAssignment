package com.company;

public class MathProblem {

    public static String getResult(int j) {
        if (j % 3 == 0 && j % 5 == 0) {
            return "FizzBuzz";
        }

        if (j % 3 == 0) {
            return "Fizz";
        }

        if (j % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(j);
    }

    public static int[] fibSeq(int number) {
        int[] fibs = new int[number];
        fibs[0] = 1;
        fibs[1] = 1;
        for(int i = 2; i < number; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs;
    }
}

