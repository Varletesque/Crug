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
    
    boolean isHovered(int x, int y, int width, int height) {
        mx = Gdx.input.getX();
        my = Gdx.graphics.getHeight() - Gdx.input.getY();

        return x <= mx && x + width >= mx && y <= my && y + height >= my;
    }

    boolean isClicked(int x, int y, int width, int height) {

        return isHovered(x, y, width, height) && Gdx.input.isButtonJustPressed(Input.Buttons.LEFT);
    }
}
