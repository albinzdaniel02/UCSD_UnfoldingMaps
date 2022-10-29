package roughgui;

import processing.core.PApplet;

public class Smiley extends PApplet{
	public void setup()
	{
		size(600,600);
		background(152,190,100);
	}
	public void draw()
	{
		fill(255,255,0);
		ellipse(300, 300, 600, 600);
		fill(0,0,0);
		ellipse(225,120,45,65);
		fill(0,0,0);
		ellipse(375,120,45,65);
		
		noFill();
		arc(300,420,220,90,0,PI);
		
	}
}
