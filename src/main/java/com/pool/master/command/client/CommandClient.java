package com.pool.master.command.client;

import com.pool.master.command.model.GameBoy;
import com.pool.master.command.model.KarbiCharacterReceiver;
import com.pool.master.command.model.MarioCharacterReceiver;
import com.pool.master.command.service.KarbiDownCommand;
import com.pool.master.command.service.KarbiLeftCommand;
import com.pool.master.command.service.KarbiRightCommand;
import com.pool.master.command.service.KarbiUpCommand;
import com.pool.master.command.service.MarioDownCommand;
import com.pool.master.command.service.MarioLeftCommand;
import com.pool.master.command.service.MarioRightCommand;
import com.pool.master.command.service.MarioUpCommand;

public class CommandClient {
    public static void main(String[] args) {
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");
        KarbiCharacterReceiver karbi = new KarbiCharacterReceiver();
        karbi.setName("Karbi");

        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);

        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);

        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);

        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KarbiUpCommand karbiUpCommand = new KarbiUpCommand(karbi);

        KarbiDownCommand karbiDownCommand = new KarbiDownCommand(karbi);

        KarbiLeftCommand karbiLeftCommand = new KarbiLeftCommand(karbi);

        KarbiRightCommand karbiRightCommand = new KarbiRightCommand(karbi);

        GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        gameBoy.leftArrow();

        GameBoy gameBoyKario = new GameBoy(karbiUpCommand, karbiDownCommand, karbiLeftCommand, karbiRightCommand);
        gameBoyKario.downArrow();
    }
}
