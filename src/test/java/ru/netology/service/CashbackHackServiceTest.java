package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    //JUnit4
    @Test
    public void shouldCountRemain() {
        int amount = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountRemainInRoundValues() {
        int amount = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }


    //JUnit5
    @org.junit.jupiter.api.Test
    public void shouldCountRemain2() {
        int amount = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCountRemainInRoundValues2() {
        int amount = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}