package com.example.android.clickcounter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClickCounterTest {
    ClickCounter ck;

    @Before
    public void initialise() {
        ck = new ClickCounter();
    }

    @Test
    public void testInitalCount() {
        Assert.assertEquals(ck.getCount(), 0);
    }

    @Test
    public void increment() {
        Assert.assertEquals(ck.getCount(), 0);
        ck.increment();
        Assert.assertEquals(ck.getCount(), 1);
    }

}