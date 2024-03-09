package org.example.uppercase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UppercaserTest {

    @Test
    public void test() {

        Uppercaser upperCaser = new Uppercaser();
        assertEquals("AAA", upperCaser.upperCase("aaa"));
    }
}