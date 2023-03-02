package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void testRemain() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}