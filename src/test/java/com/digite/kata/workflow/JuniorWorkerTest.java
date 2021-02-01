package com.digite.kata.workflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuniorWorkerTest {

    JuniorWorker worker;

    @BeforeEach
    public void setup() {
        worker = new JuniorWorker();
    }

    @Test
    public void testJuniorWorkerEats() {
        String eats = worker.eat();
        Assertions.assertEquals("JuniorWorker Eating", eats);
    }

    @Test
    public void testJuniorWorkerWorks() {
        String works = worker.work();
        Assertions.assertEquals("JuniorWorker Working",works);
    }
}
