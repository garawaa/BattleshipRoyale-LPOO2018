package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.BattleShip;
import com.mygdx.game.controller.BoardController;

/**
 * Menu Screen
 */
public class GameScreen extends ScreenAdapter {
    private BattleShip game;
    private GameStage gameStage;
    /**
     * GameScreen Default Constructor
     */
    GameScreen(BoardController board){
        game = BattleShip.getInstance();

        this.loadAssets();

        gameStage = new GameStage(board);
    }
    /**
     * Loads the assets needed by this screen.
     */
    private void loadAssets() {

        game.getAssetManager().load("square.png", Texture.class);
        game.getAssetManager().load("ship_small_b_body.png", Texture.class);
        game.getAssetManager().load("carrier.png", Texture.class);
        game.getAssetManager().load("cruiser.png", Texture.class);
        game.getAssetManager().load("patrolBoat.png", Texture.class);
        game.getAssetManager().load("submarine.png", Texture.class);
        game.getAssetManager().load("bluePatrolBoat1.png", Texture.class);
        game.getAssetManager().load("blueCruiser1.png", Texture.class);
        game.getAssetManager().load("blueCruiser2.png", Texture.class);
        game.getAssetManager().load("blueSubmarine1.png", Texture.class);
        game.getAssetManager().load("blueSubmarine2.png", Texture.class);
        game.getAssetManager().load("blueSubmarine3.png", Texture.class);
        game.getAssetManager().load("blueDreadnought1.png", Texture.class);
        game.getAssetManager().load("blueDreadnought2.png", Texture.class);
        game.getAssetManager().load("blueDreadnought3.png", Texture.class);
        game.getAssetManager().load("blueDreadnought4.png", Texture.class);
        game.getAssetManager().load("blueCarrier1.png", Texture.class);
        game.getAssetManager().load("blueCarrier2.png", Texture.class);
        game.getAssetManager().load("blueCarrier3.png", Texture.class);
        game.getAssetManager().load("blueCarrier4.png", Texture.class);
        game.getAssetManager().load("blueCarrier5.png", Texture.class);
        game.getAssetManager().finishLoading();
    }
    /**
     * Render override
     * @param delta delta
     */
    @Override
    public void render(float delta) {
        super.render(delta);

        Gdx.gl.glClearColor(255,255,255,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        gameStage.act();
        gameStage.draw();
    }
    /**
     * Resize override
     * @param width     width
     * @param height    height
     */
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        gameStage.getViewport().update(width, height, true);
    }
}

