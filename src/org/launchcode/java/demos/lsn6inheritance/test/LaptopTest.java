package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    @Test
    public void emptyTest() {
        Computer laptop  = new Laptop("Window 10", 12, 890.00, 10);
        assertEquals(12, laptop.getRAM(), .001);
        assertEquals(1, laptop.getItemId(), .001);
    }

}
