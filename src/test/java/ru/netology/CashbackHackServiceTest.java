package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBoundary1000() {
        assertEquals(1000,service.remain(0));
    }

    @Test
    public void testRemainBoundary999() {
        assertEquals(999,service.remain(1));
    }

    @Test
    public void testRemainBoundary1() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void testRemainBoundary0() {
        assertEquals(0,service.remain(1000));
    }

    @Test
    public void testRemain999() {
        assertEquals(999,service.remain(1001));
    }

    @Test
    public void testRemain800() {
        assertEquals(800, service.remain(200));
    }
}