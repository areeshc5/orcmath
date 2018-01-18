package tasks;

import java.awt.Color;

import guiPlayer.CatalogMakerGUI;
import guiPlayer.CatalogScreen;
import guiTeacher.GUIApplication;

public class Task1 extends GUIApplication {

	public Task1(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override 
	public void initScreen() {
		Game screen = new Game(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		Task1 game = new Task1(800, 550);
		Thread runner = new Thread(game);
		runner.start();
	}

}