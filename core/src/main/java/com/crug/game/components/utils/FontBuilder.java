package com.crug.game.components.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class FontBuilder {

    private static FreeTypeFontGenerator fontGen;
    private static FreeTypeFontParameter param;
    private static BitmapFont font;

    public static BitmapFont getBitmapFont(String path, int size, Color color) {
        fontGen = new FreeTypeFontGenerator(Gdx.files.internal(path));        
        param = new FreeTypeFontParameter();
        param.size = size;
        param.color = color;
        // store bitmapfont
        font = fontGen.generateFont(param);
        fontGen.dispose();
        return font;
    }
}