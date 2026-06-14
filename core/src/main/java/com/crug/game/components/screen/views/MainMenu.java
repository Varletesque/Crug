package com.crug.game.components.screen.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.crug.game.components.controllers.MainMenuController;
import com.crug.game.components.interfaces.INavigable;

public class MainMenu extends ScreenAdapter {

    private MainMenuController controller;

    public MainMenu(INavigable navigation) {
        controller = new MainMenuController(navigation);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(controller.getStage());
        controller.show();
    }
    
    @Override
    public void render(float delta) {
        // background
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // UI controller
        controller.render(delta);
        controller.draw();
    }

    @Override
    public void dispose() {
        controller.dispose();
    }
}
