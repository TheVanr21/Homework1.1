package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

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
}