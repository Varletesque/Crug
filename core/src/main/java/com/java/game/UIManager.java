package com.java.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class UIManager {

    private static UIManager instance = null;
    private static float mx, my; // mouse x axis, mouse y axis

    public UIManager() {}

    public static UIManager get() {
        if (instance == null) {
            instance = new UIManager();
        }
        return instance;
    }
    
    public boolean isHovered(int x, int y, int radius) {
        mx = Gdx.input.getX();
        my = Gdx.graphics.getHeight() - Gdx.input.getY();

        return x <= mx && x + radius >= mx && y <= my && y + radius >= my;
    }

    public boolean isClicked(int x, int y, int radius) {

        return isHovered(x, y, radius) && Gdx.input.isButtonJustPressed(Input.Buttons.LEFT);
    }
}
