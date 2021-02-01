package com.digite.kata.workflow;

public class SuperWorker implements Worker, Eater{

    public String work() {
        //.... working much more
        return "SuperWorker Working";
    }

    public String eat() {
        //.... eating in launch break
        return "SuperWorker Eating";
    }
}
