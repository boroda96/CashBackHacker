package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBoundary1000() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void testRemainBoundary999() {
        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void testRemainBoundary1() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void testRemainBoundary0() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemain999() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void testRemain800() {
        Assert.assertEquals(800, service.remain(200));
    }
}