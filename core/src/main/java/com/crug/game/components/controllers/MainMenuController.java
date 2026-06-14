package com.crug.game.components.controllers;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.crug.game.components.commands.ChangeToGameScreen;
import com.crug.game.components.commands.ExitProgram;
import com.crug.game.components.interfaces.INavigable;
import com.crug.game.components.ui.ButtonType;
import com.crug.game.components.ui.buttons.ExitButton;
import com.crug.game.components.ui.buttons.StartButton;
import com.crug.game.components.utils.FontBuilder;

public class MainMenuController extends BaseController {

    private HashMap<ButtonType, Button> buttons;
    private INavigable navigation;
    private TextButtonStyle style;

    public MainMenuController(INavigable navigation) {
        this.navigation = navigation;
        buttons = new HashMap<>();  
        
        createUI();
        for (Map.Entry<ButtonType, Button> entry : buttons.entrySet()) {
            stage.addActor(entry.getValue());
        }
    }

    private void createUI() {
        // setup the style
        style = new TextButtonStyle();                
        style.font = FontBuilder.getBitmapFont("ui/Hultog.ttf", 32, Color.WHITE);
        style.fontColor = new Color(0.961f, 0.620f, 0.043f, 1.0f); // Amber Gold
        style.overFontColor = new Color(0.471f, 0.208f, 0.059f, 1.0f); // Deep Toffee
        style.downFontColor = new Color(0.996f, 0.953f, 0.780f, 1.0f); // Creamy Amber

        // add the actors to the hashmap
        buttons.put(ButtonType.START_BUTTON, new StartButton(style, new ChangeToGameScreen(navigation)));
        buttons.put(ButtonType.EXIT_BUTTON, new ExitButton(style, new ExitProgram()));

        // placements
        Button start = buttons.get(ButtonType.START_BUTTON);
        Button exit = buttons.get(ButtonType.EXIT_BUTTON);        
        int cx = Gdx.graphics.getWidth()/2,
        cy = Gdx.graphics.getHeight()/2,
        width = 50,
        height = 30;
        
        start.setSize(width, height);
        start.setPosition(cx - width/2, cy);
        exit.setSize(width, height);
        exit.setPosition(cx - width/2, cy - height*2);
    }

}
