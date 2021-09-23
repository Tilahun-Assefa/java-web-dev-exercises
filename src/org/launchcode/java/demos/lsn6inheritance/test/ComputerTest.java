package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void emptyTest() {
        Computer computer  = new Computer("Window 10", 12, 890.00);
        assertEquals(12, computer.getRAM(), .001);
        assertEquals(1, computer.getItemId(), .001);
    }
}
