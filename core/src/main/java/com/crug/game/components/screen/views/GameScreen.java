package com.crug.game.components.screen.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.crug.game.components.controllers.GameController;
import com.crug.game.components.interfaces.INavigable;

public class GameScreen extends ScreenAdapter {

    private GameController controller;

    public GameScreen(INavigable navigation) {
        controller = new GameController(navigation);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {
        
    }
}