package com.crug.game.components.ui.buttons;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.crug.game.components.interfaces.ICommand;

public class StartButton extends TextButton {

    public StartButton(Skin skin, ICommand command) {
        super("Start", skin);

        this.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                command.execute();
            }
        });
    }
}
