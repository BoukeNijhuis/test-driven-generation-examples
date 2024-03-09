package org.example.email;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailVerifierTest {

    @Test
    public void test() {

        EmailVerifier emailVerifier = new EmailVerifier();
        assertEquals(true, emailVerifier.verify("abc@abc.nl"));
    }
}