package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach()
    public void afterEach() {
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @Test
    public void myFirstTest() {
        System.out.println("Hello!");
        Assertions.assertThat(2).isEqualTo(2);
    }

    @Test
    public void sumTest() {
        // GIVEN
        int a = 2;
        int b = 3;
        First first = new First();

        // WHEN
        int result = first.sum(a, b);

        // THEN
        Assertions.assertThat(result).isEqualTo(5);
        System.out.println("Sum test");
    }
}
