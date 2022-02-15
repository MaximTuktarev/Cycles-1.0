package ru.netology.sqr;

public class SQRService {
    public int calculate(int top, int bot) {

        int appropriateNumber = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bot && i * i <= top) {
                appropriateNumber = appropriateNumber + 1;
            }
        }
        return appropriateNumber;
    }
}

