package com.pool.master.command.service;

import com.pool.master.command.model.KarbiCharacterReceiver;

public class KarbiLeftCommand implements Command {
    private KarbiCharacterReceiver karbiCharacterReceiver;

    public KarbiLeftCommand(KarbiCharacterReceiver karbiCharacterReceiver) {
        this.karbiCharacterReceiver = karbiCharacterReceiver;
    }

    @Override
    public void execute() {
        karbiCharacterReceiver.moveLeft();

    }

}
