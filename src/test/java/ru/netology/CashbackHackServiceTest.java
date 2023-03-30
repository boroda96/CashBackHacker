package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBoundaryValuesTwo() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainBoundaryValuesThree() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void testRemainBoundaryValuesFour() {
        assertEquals(service.remain(999), 1);
    }

//    @Test
//    public void testRemainBoundaryValuesFive() {
//        assertEquals(service.remain(1000), 0);
//    }

    @Test
    public void testRemainBoundaryValuesSix() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testRemainCriticalPath() {
        assertEquals(service.remain(200), 800);
    }
}