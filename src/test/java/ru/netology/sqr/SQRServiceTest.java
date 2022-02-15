package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCalculateNumber1() {

        SQRService service = new SQRService();
        int bot = 300;
        int top = 5000;
        int expected = 53;

        long actual = service.calculate(top, bot);
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateNumber2() {

        SQRService service = new SQRService();
        int bot = 100;
        int top = 200;
        int expected = 5;

        long actual = service.calculate(top, bot);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumber3() {

        SQRService service = new SQRService();
        int bot = 10;
        int top = 1000;
        int expected = 22;

        long actual = service.calculate(top, bot);
        assertEquals(expected, actual);
    }
}