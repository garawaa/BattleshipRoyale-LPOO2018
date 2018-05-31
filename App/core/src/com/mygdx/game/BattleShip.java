package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.mygdx.game.utility.ButtonFactory;
import com.mygdx.game.view.MenuScreen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * BattleShip game class (singleton)
 */
public class BattleShip extends Game {
	private static BattleShip battleship;
	private AssetManager assetManager;
	private SpriteBatch batch;
	private BattleShip game;
	/**
	 * Creates a new game and set the current screen
	 */
	@Override
	public void create() {
		battleship = this;
		assetManager = new AssetManager();
        batch = new SpriteBatch();
		ButtonFactory factory = new ButtonFactory();
		setScreen(new MenuScreen());
	}
	/**
	 * Dispose Override
	 */
	@Override
	public void dispose() {
		super.dispose();
		assetManager.dispose();
		batch.dispose();
	}
	/**
	 * Getter for the game instance
	 * @return	game instance
	 */
	public static BattleShip getInstance() {
		return battleship;
	}
	/**
	 * Getter for the asset manager
	 * @return	asset manager
	 */
	public AssetManager getAssetManager() {
		return assetManager;
	}
	/**
	 * Getter for the sprite batch
	 * @return	sprite batch
	 */
	public SpriteBatch getBatch() {
		return batch;
	}
}