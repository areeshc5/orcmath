package tasks;

import guiTeacher.GUIApplication;

	public class Task2 extends GUIApplication{

		public Task2(int width, int height) {
			super(width, height);
			setVisible(true);
		}

		@Override
		public void initScreen() {
			Game2 screen = new Game2(getWidth(), getHeight());
			setScreen(screen);
		}

		public static void main(String[] args) {
			Task2 game = new Task2(800, 500);
			Thread runner = new Thread(game);
			runner.start();
		}
	}
