package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstGetEvenTest {

    @Test
    @DisplayName("WHEN null list is given THEN empty list is returned")
    public void testGetEvenNull() {
        First first = new First();

        List<Integer> even = first.getEven(null);

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("WHEN empty list is given THEN empty list is returned")
    public void testGetEvenEmpty() {
        // SETUP
        First first = new First();
        ArrayList<Integer> list = new ArrayList<>();

        // RUN
        List<Integer> even = first.getEven(list);

        // ASSERT
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("WHEN list with no even numbers is given THEN empty list is returned")
    public void testGetEvenNoEven() {
        // SETUP
        First first = new First();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);

        // RUN
        List<Integer> even = first.getEven(list);

        // ASSERT
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("WHEN list with even numbers is given THEN list with even numbers is returned")
    public void testGetEven() {
        // SETUP
        First first = new First();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(4);

        // RUN
        List<Integer> even = first.getEven(list);

        // ASSERT
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).hasSize(3);
        Assertions.assertThat(even).containsExactly(4, 2, 4);
    }
}
