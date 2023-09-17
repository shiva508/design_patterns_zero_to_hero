package com.pool.master.command.service;

import com.pool.master.command.model.MarioCharacterReceiver;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveLeft();
    }

}
