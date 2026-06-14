package com.crug.game.components.controllers;

import java.util.HashMap;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.crug.game.components.interfaces.INavigable;
import com.crug.game.components.ui.ButtonType;

public class GameController {

    private HashMap<ButtonType, Button> buttons;

    public GameController(INavigable navigation) {
        buttons = new HashMap<>();

        //buttons.put(null, null);

        //createUI();
    }

    private void createUI() {
        //stage.addActor(null);
    }
}
