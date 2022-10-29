package roughgui;

import processing.core.PApplet;
import processing.core.*;

public class UsingImage extends PApplet{
	PImage img;
	int imgh=1000,imgw=1600;
	public void setup()
	{
		size(imgw,imgh);
		background(255);//black bgcolor
		img = loadImage("https://wallpapercave.com/wp/j7c1FtS.jpg");
		img.resize(0, imgh);
		image(img,0,0);
		
	}
	public void draw()
	{
		int color[]= {255,255,0};
		fill(color[0],color[1],color[2]);
		ellipse(800, 400, 220, 220);
	}
}
