package org.fasttrackit;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testNewPersonWithNullName() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Person(null, 10);
        });
    }

    @Test
    public void testNewPersonWithNegativeAge() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Person("Alex", -10);
        });
    }

    @Test
    public void testCreatePersonInvalidParams() {
        Person result = Person.createPerson(null, -10);
        org.assertj.core.api.Assertions.assertThat(result).isEqualTo(null);
    }
}
