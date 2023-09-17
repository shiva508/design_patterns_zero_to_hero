package com.pool.master.command.model;

import com.learn.master.command.service.Command;

public class GameBoy {
    private Command upCommand;
    private Command downCommand;
    private Command leftCommand;
    private Command rigtCommand;

    public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rigtCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.leftCommand = leftCommand;
        this.rigtCommand = rigtCommand;
    }

    public void upArrow() {
        upCommand.execute();
    }

    public void downArrow() {
        downCommand.execute();
    }

    public void rightArrow() {
        rigtCommand.execute();
    }

    public void leftArrow() {
        leftCommand.execute();
    }

}
