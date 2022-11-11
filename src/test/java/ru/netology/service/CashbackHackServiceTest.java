package ru.netology.service;


import org.junit.jupiter.api.Test;
import ru.neyology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {

        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    void remainOver() {

        int amount = 1555;
        int expected = 445;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    void remainUnderOnOne() {

        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    void remainOverOnOne() {

        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }

    @Test
    void remainEqual() {

        int amount = 3000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);

    }
}