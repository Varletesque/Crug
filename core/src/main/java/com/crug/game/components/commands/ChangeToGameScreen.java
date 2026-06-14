package com.crug.game.components.commands;

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
        navigation.changeScreen(ScreenType.GAME);
    }
}
