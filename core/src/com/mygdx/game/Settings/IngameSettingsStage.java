package com.mygdx.game.Settings;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.Music.MusicSetter;
import com.mygdx.game.MyBaseClasses.MyButton;
import com.mygdx.game.MyBaseClasses.MyStage;
import com.mygdx.game.MyBaseClasses.OneSpriteStaticActor;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Play.PlayScreen;
import com.mygdx.game.Play.PlayStage;

/**
 * Created by Vince on 2016. 11. 13..
 */

public class IngameSettingsStage extends MyStage {

    private TextButton textButton, textButton2;
    private OneSpriteStaticActor hang, a;
    static boolean b = true;
    MusicSetter musicSetter = new MusicSetter();

    private float width, heigth;

    public IngameSettingsStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
    }


    @Override
    public boolean keyDown(int keyCode) {
        if (keyCode == Input.Keys.BACK)
        {
            game.setScreenBackByStackPop();
            SettingsStage.b=b;
            musicSetter.stopMusics();
            if(b)musicSetter.MenuMusic();
        }
        return false;
    }

    public void init() {
        addBackEventStackListener();

        a = new OneSpriteStaticActor(Assets.manager.get(Assets.BACKGROUND_TEXTURE));
        a.setWidth(((ExtendViewport) getViewport()).getMinWorldWidth());
        a.setHeight(((ExtendViewport) getViewport()).getMinWorldHeight()/2);
        a.setY(((ExtendViewport) getViewport()).getMinWorldHeight()/4);
        addActor(a);

        textButton2 = new MyButton("Back to Game", game.getTextButtonStyle());
        textButton2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                PlayStage.setSettingclick(false);
            }
        });
        addActor(textButton2);

        textButton = new MyButton("Back to Menu", game.getTextButtonStyle());
        textButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                musicSetter.stopMusics();
                if(b)musicSetter.MenuMusic();
                SettingsStage.b=b;
                game.setScreenBackByStackPop();
            }
        });
        addActor(textButton);

        resized();

        musicOnOff();
    }

    @Override
    protected void resized() {
        super.resized();
        width = (((ExtendViewport)getViewport()).getMinWorldWidth())/2; //vízszintesen középre
        heigth = (((ExtendViewport)getViewport()).getMinWorldHeight()); //magasság

        textButton.setPosition(width - ((textButton.getWidth()) / 2), heigth-((ExtendViewport)getViewport()).getMinWorldHeight()/4*3);
        textButton2.setPosition(width - ((textButton.getWidth()) / 2),heigth-((ExtendViewport)getViewport()).getMinWorldHeight()/5*3);
    }

    void musicOnOff(){
        hang = new OneSpriteStaticActor(Assets.manager.get(b?Assets.SOUND_ICON:Assets.MUTE_ICON));
        addActor(hang);
        hang.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                hang.remove();
                b = !b;
                if(!b) {
                    musicSetter.stopMusics();
                }
                musicOnOff();
            }
        });
        hang.setSize(width / 3, width / 3);
        hang.setPosition(0, heigth - hang.getHeight()-((ExtendViewport)getViewport()).getMinWorldHeight()/4);
    }


    public static boolean isB() {
        return b;
    }


}