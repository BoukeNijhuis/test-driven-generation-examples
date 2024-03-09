package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnotherThingTest {

    @Test
    public void test() {

        AnotherThing anotherThing = new AnotherThing();
        assertEquals(true, anotherThing.doSomething("abc@abc.nl"));
        assertEquals(true, anotherThing.doSomething("a@abc.nl"));
        assertEquals(true, anotherThing.doSomething("bouke@example.com"));
        assertEquals(false, anotherThing.doSomething("bouke.com"));
    }
}