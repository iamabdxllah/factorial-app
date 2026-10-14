
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testFactorial() {
        App app = new App();
        assertEquals(120, app.factorial(5));
    }

    @Test
    void testZeroFactorial() {
        App app = new App();
        assertEquals(1, app.factorial(0));
    }

    @Test
    void testNegativeNumber() {
        App app = new App();

        assertThrows(IllegalArgumentException.class,
                     () -> app.factorial(-1));
    }
}
