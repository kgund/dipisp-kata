package com.digite.kata.workflow;

public class RobotWorker implements Worker{

    public String work() {
        // ....working
        return null;
    }

    public String eat() {
        throw new RuntimeException();
    }
}
