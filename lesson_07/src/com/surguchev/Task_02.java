package com.surguchev;

//Найти количество счастливых билетиков на трамвай от 000001 до 999999 (те у которых сумма первых 3 цифр равна сумме последних 3)

public class Task_02 {

    public static final int minNumberTickets = 1;
    public static final int maxNumberTickets = 999999;

    public static void main(String[] args) {
        int countLuckyTickets = 0;

        for (int i = minNumberTickets; i <= maxNumberTickets; i++) {
            String strNum = String.valueOf(i);
            if (strNum.length() > 3) {
                if (chekSumLeftAndRigth(strNum)) {
                    countLuckyTickets++;
                }
            }
        }
        System.out.println("number of lucky tickets: " + countLuckyTickets);
    }

    private static boolean chekSumLeftAndRigth(String num) {
        int sumRigth = 0;
        int sumLeft = 0;
        int cntRigthNumberForSum = 0;
        String[] arrayNum = num.split("");
        for (int j = arrayNum.length - 1; j >= 0; j--) {
            if (cntRigthNumberForSum > 2) {
                sumLeft += Integer.parseInt(arrayNum[j]);
            } else {
                sumRigth += Integer.parseInt(arrayNum[j]);
            }
            cntRigthNumberForSum++;
        }
        return sumLeft == sumRigth;
    }
}
