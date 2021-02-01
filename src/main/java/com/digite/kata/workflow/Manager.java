package com.digite.kata.workflow;

public class Manager {

    Worker worker;

    public void setWorker(Worker worker) {
        this.worker=worker;
    }

    public String manage() {
        worker.work();
        return null;
    }
}
