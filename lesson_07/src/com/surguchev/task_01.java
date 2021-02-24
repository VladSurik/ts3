package com.surguchev;

// Электронные часы показывают время в формате от 00:00 до 23:59.
// Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
// что справа от двоеточия (например, 02:20, 11:11 или 15:51).

public class task_01 {

    public static void main(String[] args) {
        int numberOfMatches = 0;
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                if (DoubleSymbolForTime(h).equals(DoubleSymbolForTime(m))) {
                    numberOfMatches++;
                }
            }
        }
        System.out.println(numberOfMatches);
    }

    private static String DoubleSymbolForTime(int num) {
        String hoursDouble = String.valueOf(num);
        if (hoursDouble.length() == 1) {
            hoursDouble = "0" + hoursDouble;
        }
        return hoursDouble;
    }
}
