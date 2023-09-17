package com.pool.master.command.service;

import com.learn.master.command.model.KarbiCharacterReceiver;

public class KarbiDownCommand implements Command {
    private KarbiCharacterReceiver karbiCharacterReceiver;

    public KarbiDownCommand(KarbiCharacterReceiver karbiCharacterReceiver) {
        this.karbiCharacterReceiver = karbiCharacterReceiver;
    }

    @Override
    public void execute() {
        karbiCharacterReceiver.moveDown();
    }

}
