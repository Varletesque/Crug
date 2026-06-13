package com.crug.game.components.ui;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.crug.game.components.interfaces.INavigable;
import com.crug.game.components.ui.buttons.ExitButton;
import com.crug.game.components.ui.buttons.StartButton;
import com.crug.game.components.ui.commands.ChangeToGameScreen;
import com.crug.game.components.ui.commands.ExitProgram;

public class UIManager {

    private HashMap<ButtonType, Button> buttons;

    private TextButtonStyle mainMenuStyle;
    private BitmapFont mainFont;

    private Stage stage;
    private Skin skin;

    public UIManager(INavigable navigation) {

        // instances
        buttons = new HashMap<>();
        stage = new Stage();        
        skin = new Skin(Gdx.files.internal("ui/uiskin.json"));     

        // add buttons to the hashmap, pass commands to the button
        buttons.put(ButtonType.START_BUTTON, new StartButton(skin, new ChangeToGameScreen(navigation)));
        buttons.put(ButtonType.EXIT_BUTTON, new ExitButton(skin, new ExitProgram()));

        // set style for StyleButtons
        mainMenuStyle = new TextButtonStyle();
        mainFont = new BitmapFont(Gdx.files.internal(null));
        setMainMenuStyle(mainMenuStyle);

        // setup actors
        setMainMenuActors();

        // set stage to handle all inputs
        Gdx.input.setInputProcessor(stage);        

        // add the actors to the stage
        for (Map.Entry<ButtonType, Button> entry : buttons.entrySet()) {
            stage.addActor(entry.getValue());
        }
    }

    private void setMainMenuActors() {
        int width = 50;
        int height = 30;
        int centerx = Gdx.graphics.getWidth()/2;
        int centery = Gdx.graphics.getHeight()/2;

        // start button
        buttons.get(ButtonType.START_BUTTON).setPosition(centerx - width/2, centery);
        buttons.get(ButtonType.START_BUTTON).setSize(width, height);
        // exit button
        buttons.get(ButtonType.EXIT_BUTTON).setPosition(centerx - width/2, centery - height*2);
        buttons.get(ButtonType.EXIT_BUTTON).setSize(width, height);
    }

    private void setMainMenuStyle(TextButtonStyle style) {
        style.font = mainFont;
    }

    public void render(float delta) {
        stage.act(delta);
        stage.draw();
    }

    public void dispose() {
        skin.dispose();
        stage.dispose();        
    }
}