package com.digite.kata.workflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SuperWorkerTest {
    SuperWorker worker;

    @BeforeEach
    public void setup() {
        worker = new SuperWorker();
    }

    @Test
    public void testSuperWorkerEats() {
        String eats = worker.eat();
        Assertions.assertEquals("SuperWorker Eating", eats);
    }

    @Test
    public void testSuperWorkerWorks() {
        String works = worker.work();
        Assertions.assertEquals("SuperWorker Working", works);
    }
}
