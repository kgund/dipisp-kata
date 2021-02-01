package com.digite.kata.workflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RobotWorkerTest {
    RobotWorker worker;

    @BeforeEach
    public void setup() {
        worker = new RobotWorker();
    }

    @Test
    public void testRobotWorkerEats() {
        String eats = worker.eat();
        Assertions.assertEquals("RobotWorker Eating", eats);
    }

    @Test
    public void testRobotWorkerWorks() {
        String works = worker.work();
        Assertions.assertEquals("RobotWorker Working",works);
    }
}
