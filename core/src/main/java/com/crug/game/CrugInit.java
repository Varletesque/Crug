package com.crug.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.crug.game.components.ui.UIManager;
import com.crug.game.components.screen.ScreenManager;

public class CrugInit extends Game {

    private ScreenManager screen;
    private UIManager ui;

    @Override
    public void create() {
        screen = new ScreenManager(this);
        ui = new UIManager(screen);
    }

    @Override
    public void render() {
        float delta = Gdx.graphics.getDeltaTime();

        super.render();
        ui.render(delta);
    }

    @Override
    public void dispose() {
        ui.dispose();
    }
}
