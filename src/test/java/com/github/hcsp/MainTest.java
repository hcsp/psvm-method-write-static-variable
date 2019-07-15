package com.github.hcsp;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void updateStaticVariableTest() throws Exception {
        Assertions.assertEquals(readStaticVariable().toLowerCase(), "hello");
        Main.main(null);
        Assertions.assertEquals(readStaticVariable().toLowerCase(), "hi");
    }

    private String readStaticVariable() throws Exception {
        Field field = Main.class.getDeclaredField("message");
        field.setAccessible(true);
        return (String) field.get(null);
    }
}
