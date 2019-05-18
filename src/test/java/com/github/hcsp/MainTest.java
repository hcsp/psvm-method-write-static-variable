package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void updateStaticVariableTest() {
        assertEquals(Main.message.toLowerCase(), "hello");
        Main.updateMessage();
        assertEquals(Main.message.toLowerCase(), "hi");
    }
}
