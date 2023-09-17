package com.pool.master.command.service;

import com.pool.master.command.model.KarbiCharacterReceiver;

public class KarbiRightCommand implements Command {

    private KarbiCharacterReceiver karbiCharacterReceiver;

    public KarbiRightCommand(KarbiCharacterReceiver karbiCharacterReceiver) {
        this.karbiCharacterReceiver = karbiCharacterReceiver;
    }

    @Override
    public void execute() {
        karbiCharacterReceiver.moveRight();
    }

}
