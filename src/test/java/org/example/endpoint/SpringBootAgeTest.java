package org.example.endpoint;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootAgeTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testEndpoint() throws Exception {
        testAgeEndpoint("2025-01-01", 0);
        testAgeEndpoint("2020-01-01", 5);
        testAgeEndpoint("2000-01-01", 25);
        testAgeEndpoint("2000-12-31", 24);
    }

    public void testAgeEndpoint(String birthDate, int age) throws Exception {
        String result = this.restTemplate.getForObject("http://localhost:" + port + "/age/" + birthDate,
                String.class);
        assertEquals(String.valueOf(age), result);
    }

}