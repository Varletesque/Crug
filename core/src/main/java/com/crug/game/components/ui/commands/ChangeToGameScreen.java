package com.crug.game.components.ui.commands;

import com.crug.game.components.interfaces.ICommand;
import com.crug.game.components.interfaces.INavigable;
import com.crug.game.components.screen.ScreenType;

public class ChangeToGameScreen implements ICommand {
    
    private INavigable navigation;

    public ChangeToGameScreen(INavigable navigation) {
        this.navigation = navigation;
    }

    @Override
    public void execute() {
        System.out.println("code executed");
        navigation.changeScreen(ScreenType.GAME);
    }
}
