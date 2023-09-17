package com.pool.master.facade.model;

public class ComputerFacade {
    private Cpu processor;
    private Harddrive harddrive;
    private Memory memory;

    public ComputerFacade(Cpu processor, Harddrive harddrive, Memory memory) {
        this.processor = processor;
        this.harddrive = harddrive;
        this.memory = memory;
    }

    public void startProcess() {
        this.processor.freezze();
        this.harddrive.getByteData();
        this.memory.load();
    }
}
