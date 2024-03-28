package com.fortune.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class myappTest
{
    @Test
    public void testAppConstructor() {
        myapp app1 = new App();
        myapp app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        myapp app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}
