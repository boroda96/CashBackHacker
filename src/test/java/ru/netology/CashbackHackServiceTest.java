package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBoundaryValuesTwo() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainBoundaryValuesThree() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void testRemainBoundaryValuesFour() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void testRemainBoundaryValuesFive() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testRemainBoundaryValuesSix() {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testRemainCriticalPath() {
        Assert.assertEquals(service.remain(200), 800);
    }
}