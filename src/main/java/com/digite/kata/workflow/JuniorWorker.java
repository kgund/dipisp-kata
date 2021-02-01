package com.digite.kata.workflow;

public class JuniorWorker implements Worker{

    public String work() {
        // ....working
        return "JuniorWorker Working";
    }
    public String eat() {
        // ...... eating in launch break
        return "JuniorWorker Eating";
    }
}
