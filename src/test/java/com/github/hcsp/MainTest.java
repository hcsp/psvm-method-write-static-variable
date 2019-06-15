package com.github.hcsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void updateStaticVariableTest() {
        Assertions.assertEquals(Main.message.toLowerCase(), "hello");
        Main.updateMessage();
        Assertions.assertEquals(Main.message.toLowerCase(), "hi");
    }
}
