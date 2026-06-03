package com.java.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Run extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture image;
    private ShapeRenderer shape;
    private BitmapFont font;
    private Sound sound;

    //Circle properties
    private int circleX = 320;
    private int circleY = 380;
    private int radius = 50;

    

    @Override
    public void create() {
        batch = new SpriteBatch();
        shape = new ShapeRenderer();
        sound = Gdx.audio.newSound(Gdx.files.internal("cat.mp3"));

        font = new BitmapFont();
        font.getData().setScale(1.5f);
        font.setColor(Color.WHITE);

    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        drawCircle();
        buttonClicked();
    }

    private void buttonClicked() {
        if(UIManager.get().isClicked(circleX, circleY, radius)) {
            sound.play();
            System.out.println(" U Agree that dogs are STOOPID!");
        } else {
            shape.setColor(0.5f, 0.0f, 0.0f, 1.0f);
        }
    }

    private void drawCircle() {
        shape.begin(ShapeType.Filled);
        shape.setColor(Color.RED);
        shape.circle(circleX, circleY, radius);
        shape.end();
    }




    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
        shape.dispose();
    }
}
