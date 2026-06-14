package com.crug.game;

import com.badlogic.gdx.Game;
import com.crug.game.components.screen.ScreenManager;

public class CrugInit extends Game {

    private ScreenManager screen;

    @Override
    public void create() {
        screen = new ScreenManager(this);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        screen.dispose();
    }
}
