package com.pool.master.facade.model;

public class FacadeClient {
    public static void main(String[] args) {
        Cpu processor = new Cpu();
        Harddrive harddrive = new Harddrive();
        Memory memory = new Memory();
        ComputerFacade computerFacade = new ComputerFacade(processor, harddrive, memory);
        computerFacade.startProcess();
    }
}
