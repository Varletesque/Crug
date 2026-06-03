package com.java.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Run extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private ShapeRenderer shape;

    @Override
    public void create() {
        batch = new SpriteBatch();
        shape = new ShapeRenderer();

    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(image, 140, 210);
        batch.end();

        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.triangle(100, 100, 200, 100, 150, 200);
        shape.end();
    }



    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
        shape.dispose();
    }
}
