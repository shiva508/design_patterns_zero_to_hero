package com.pool.master.command.service;

import com.learn.master.command.model.KarbiCharacterReceiver;

public class KarbiUpCommand implements Command {

    private KarbiCharacterReceiver karbiCharacterReceiver;

    public KarbiUpCommand(KarbiCharacterReceiver karbiCharacterReceiver) {
        this.karbiCharacterReceiver = karbiCharacterReceiver;
    }

    @Override
    public void execute() {
        karbiCharacterReceiver.moveUp();
    }

}
