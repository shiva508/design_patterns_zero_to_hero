package com.pool.master.command.service;

import com.learn.master.command.model.MarioCharacterReceiver;

public class MarioUpCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioUpCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveUp();
    }

}
