package com.crug.game.components.ui.buttons;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.crug.game.components.interfaces.ICommand;

public class StartButton extends TextButton {

    public StartButton(TextButtonStyle style, ICommand command) {
        super("Start", style);

        this.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                command.execute();
            }
        });
    }
}
