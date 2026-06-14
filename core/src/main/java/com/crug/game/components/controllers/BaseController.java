package com.crug.game.components.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class BaseController {

    protected Stage stage;
    protected boolean isActive;

    public BaseController() {
        stage = new Stage();
    }

    public void render(float delta) {
        if (isActive) stage.act(delta);
    }

    public void draw() {
        if (isActive) stage.draw();
    }

    public void show() {
        isActive = true;
        Gdx.input.setInputProcessor(stage);
        onShow();           
    }

    public void hide() {
        isActive = false;
        Gdx.input.setInputProcessor(null);
        onHide();
    }

    public void dispose() {
        stage.dispose();
    }

    public Stage getStage() {
        return stage;
    }

    protected void onShow() {};

    protected void onHide() {};
}