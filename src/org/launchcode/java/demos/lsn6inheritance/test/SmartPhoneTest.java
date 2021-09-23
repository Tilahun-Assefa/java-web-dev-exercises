package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;
import org.launchcode.java.demos.lsn6inheritance.technology.SmartPhone;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    @Test
    public void emptyTest() {
        Computer phone  = new SmartPhone("Android", 16, 590.00, "Verizon");
        assertEquals(16, phone.getRAM(), .001);
        assertEquals(1, phone.getItemId(), .001);
    }
}
