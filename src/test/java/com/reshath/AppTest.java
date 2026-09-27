package com.reshath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetGreeting() {
        String result = App.getGreeting();
        assertEquals("Hi there!", result);
    }
}
