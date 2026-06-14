package com.crug.game.components.screen;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import com.crug.game.components.interfaces.INavigable;
import com.crug.game.components.screen.views.GameScreen;
import com.crug.game.components.screen.views.MainMenu;

public class ScreenManager implements INavigable {

    private HashMap<ScreenType, Screen> screens;
    private Game game;

    public ScreenManager(Game game) {
        this.game = game;
        screens = new HashMap<>();    

        // add the screens the map
        screens.put(ScreenType.MAIN_MENU, new MainMenu(this));
        screens.put(ScreenType.GAME, new GameScreen(this));
        
        // set first screen
        game.setScreen(screens.get(ScreenType.MAIN_MENU));
    }

    @Override
    public void changeScreen(ScreenType screen) {
        game.setScreen(screens.get(screen));
    }

    public void dispose() {
        for (Map.Entry<ScreenType, Screen> entry : screens.entrySet()) {
            entry.getValue().dispose();
        }
    }
}
