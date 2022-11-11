package ru.netology.service;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

import ru.neyology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remain() {

        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void remainOver() {

        int amount = 1555;
        int expected = 445;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void remainUnderOnOne() {

        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void remainOverOnOne() {

        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void remainEqual() {

        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals (actual, expected);

    }

}