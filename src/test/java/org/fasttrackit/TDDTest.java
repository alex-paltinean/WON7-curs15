package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a function TDD.find that receives a list and a number and returns the index or -1 if not found
 */

//@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoJUnitRunner.class)
public class TDDTest {

    @Test
    public void instantiateClass() {
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod() {
        TDD tdd = new TDD();
        tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public void methodReturnsAnInt() {
        TDD tdd = new TDD();
        int result = tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public void returnMinusOneIfNotFound() {
        // GIVEN
        TDD tdd = new TDD();
        ArrayList<Integer> list = new ArrayList<>();
        int element = 2;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnIndexIfFound() {
        // GIVEN
        TDD tdd = new TDD();
        List<Integer> list = Arrays.asList(1, 3, 6);
        int element = 3;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnMinusOneIfListIsNull() {
        // GIVEN
        TDD tdd = new TDD();
        ArrayList<Integer> list = null;
        int element = 2;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

//    @Test
//    public void runWithMokito() {
//        TDD tdd = Mockito.mock(TDD.class);
//        Mockito.when(tdd.find(Mockito.anyList(), Mockito.any())).thenCallRealMethod();
//
//        int result = tdd.find(new ArrayList<>(), 2);
//        Assertions.assertThat(result).isEqualTo(-1);
//    }
}
