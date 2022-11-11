package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.neyology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {

        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals (expected, actual);

    }

    @org.junit.Test
    public void remainOver() {

        int amount = 1555;
        int expected = 445;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals (expected, actual);

    }

    @org.junit.Test
    public void remainUnderOnOne() {

        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals (expected, actual);

    }

    @org.junit.Test
    public void remainOverOnOne() {

        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals (expected, actual);

    }

    @org.junit.Test
    public void remainEqual() {

        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals (expected, actual);

    }

    @Test
    public void remainJ5() {

        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    public void remainOverJ5() {

        int amount = 1555;
        int expected = 445;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    public void remainUnderOnOneJ5() {

        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    public void remainOverOnOneJ5() {

        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    public void remainEqualJ5() {

        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }


}