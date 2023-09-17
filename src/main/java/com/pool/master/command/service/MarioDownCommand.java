package com.pool.master.command.service;

import com.learn.master.command.model.MarioCharacterReceiver;

public class MarioDownCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioDownCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveDown();

    }

}
