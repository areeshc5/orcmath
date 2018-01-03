package simon;

import guiTeacher.GUIApplication;


public class SimonGameAreej extends GUIApplication {
	public static SimonGameAreej game;
	public static SimonScreenAreej  screen;
	
	public SimonGameAreej(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		game = new SimonGameAreej(440, 640);
		 Thread runner = new Thread(game);
		 runner.start();

	}

	@Override
	public void initScreen() {
		screen = new SimonScreenAreej(getWidth(), getHeight());
		
	}

}
