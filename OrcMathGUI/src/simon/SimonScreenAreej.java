package simon;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenAreej extends ClickableScreen implements Runnable{

	private TextLabel label;
	private ButtonInterfaceAreej[] buttons;
	private ProgressInterfaceAreej progress;
	private ArrayList<MoveInterfaceAreej> arr;
	
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;
	
	public SimonScreenAreej(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceAreej b: buttons){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		arr = new ArrayList<MoveInterfaceAreej>();
		//add 2 moves to start
		lastSelectedButton = -1;
		arr.add(randomMove());
		arr.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	public MoveInterfaceAreej randomMove() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	public ProgressInterfaceAreej getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addButtons() {
		
		
	}

}
