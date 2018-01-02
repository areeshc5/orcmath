package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;


public class CustomButton extends Button implements CustomLabel{
	
	private String s1;
	private String s2;
	private Color color;

	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	
	public void updateString1(String string) {
		s1= string;
	}

	
	public void updateString2(String string) {
		s2 = string;
		
	}

	public void setIconColor(Color color) {
		this.color = color;
		
	}
	
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.black);
		
	}

	
}
