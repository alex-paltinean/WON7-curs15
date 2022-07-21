package org.fasttrackit;

import java.util.List;

public class TDD {

    public int find(List<Integer> list, int i) {
        doSomething();
        if (list == null || !list.contains(i)) {
            return -1;
        }
        return list.indexOf(i);
    }

    public void doSomething() {
        throw new RuntimeException();
    }
}
