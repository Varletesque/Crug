package com.java.game;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

import com.badlogic.gdx.ApplicationAdapter;

import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Run extends ApplicationAdapter {
    private ShapeRenderer shape;
    private int cx, cy, cr;

    @Override
    public void create() {
        shape = new ShapeRenderer();
        cx = Gdx.graphics.getWidth()/2;
        cy = Gdx.graphics.getHeight()/2;
        cr = 50;
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.051f, 0.075f, 0.067f, 1.0f);

        // animations

        // renders a circle
        shape.begin(ShapeType.Filled);
        if (!UIManager.get().isHoveredCircle(cx, cy, cr)) {
            shape.setColor(0.957f, 0.945f, 0.918f, 1.0f);
        } else {
            shape.setColor(0.322f, 0.718f, 0.533f, 1.0f);
        }
        shape.circle(cx, cy, cr);
        shape.end();

    }




    @Override
    public void dispose() {
        shape.dispose();
    }
}
