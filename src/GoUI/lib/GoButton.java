package GoUI.lib;

import processing.core.PFont;
import processing.core.PApplet;


public class GoButton extends GoPiece
{
	float radi = 0.0f;
	
	// See Piece constructor
	public GoButton(int x, int y, int w, int h) 
	{
		super(x, y, w, h);
	}
	public GoButton(int x, int y, int w, int h, String color)
	{
		super(x, y, w, h, color);
	}
	public GoButton(int x, int y, int w, int h, String displayText, PFont text, String color)
	{
		super(x, y, w, h, displayText, text, color);
	}
	public GoButton(int x, int y, int w, int h, float radi, String displayText, PFont text, String color)
	{
		super(x, y, w, h, displayText, text, color);
		this.radi = radi;
	}
	
	public void Draw(PApplet p) 
	{
		super.Draw(p);
	}

}