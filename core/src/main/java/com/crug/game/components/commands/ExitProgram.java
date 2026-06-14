package com.crug.game.components.commands;

import com.badlogic.gdx.Gdx;
import com.crug.game.components.interfaces.ICommand;

public class ExitProgram implements ICommand {    
    
    @Override
    public void execute() {
        System.out.println("code executed");
        Gdx.app.exit();
    }
}
