package myStuff;

import java.util.List;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import guiTeacher.components.*;

public class CatalogScreen extends FullFunctionScreen {

	private TextField description;
	private Button add;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		description = new TextField(40,40,200,30,"Text Here","Food");
		viewObjects.add(description);
		add = new Button(70,70,100,40, "ADD", new Action() {
			
			@Override
			public void act() {
				description.setText("you clicked the button");
				
			}
		} );
		
		viewObjects.add(add);

	}
	
	

}
