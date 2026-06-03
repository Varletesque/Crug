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
    
    public boolean isHoveredRect(int x, int y, int width, int height) {
        mx = Gdx.input.getX();
        my = Gdx.graphics.getHeight() - Gdx.input.getY();
        return x <= mx && x + width >= mx && y <= my && y + height >= my;
    }

    public boolean isClickedRect(int x, int y, int width, int height) {
        return isHoveredRect(x, y, width, height) && Gdx.input.isButtonJustPressed(Input.Buttons.LEFT);
    }

    public boolean isHoveredCircle(int x, int y, int r) {
        mx = Gdx.input.getX();
        my = Gdx.graphics.getHeight() - Gdx.input.getY();
        float dx = mx - x;
        float dy = my - y;
        return (dx * dx + dy * dy) <= (r * r);
    }

    public boolean isClickedCircle(int x, int y, int r) {
        return isHoveredCircle(x, y, r) && Gdx.input.isButtonJustPressed(Input.Buttons.LEFT);
    }
}
