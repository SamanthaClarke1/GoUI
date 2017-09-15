package GoUI.lib;

import processing.core.PFont;
import processing.core.PApplet;

public class GoPiece {
	public GoRect r;
	boolean isInitialized = false;
	boolean hasText = false;
	boolean mLeftIsEnabled = true;
	boolean mRightIsEnabled = false;
	
	PFont text;
	String displayText = "";
	String color = "";
	
	public String ID = "";
	
	/* Constructor
	 * Takes in Position and Dimensions
	 */
	public GoPiece(int x, int y, int w, int h) 
	{
		this.r = new GoRect(x, y, w, h);
		
		this.isInitialized = true;
	}
	public GoPiece(int x, int y, int w, int h, String color)
	{
		this.r = new GoRect(x, y, w, h);
		this.color = color;
		
		this.isInitialized = true;
	}
	public GoPiece(int x, int y, int w, int h, String displayText, PFont text, String color)
	{
		this.r = new GoRect(x, y, w, h);
		this.text = text;
		this.color = color;
		this.displayText = displayText;
		
		this.isInitialized = true;
		this.hasText = true;
	}
	/* Checks the program for mouse input, returns "L", "R", "LR", "". 
	 * Depending on the keys pressed.
	 */
	public String Check(int mouseX, int mouseY, boolean mLeft, boolean mRight)
	{
		String retstring = "";
		
		if (       mouseX > this.r.left 
				&& mouseY > this.r.top 
				&& mouseX < this.r.right 
				&& mouseY < this.r.bot)
		{
			if (mLeft && mLeftIsEnabled) 
			{
				retstring += "L";
			}
			if (mRight && mRightIsEnabled) 
			{
				retstring += "R";
			}
		}
		
		return retstring;
	}
	
	public void Draw(PApplet p) 
	{
		String[] rgb = color.split(",");
		
		p.rect(r.x, r.y, r.w, r.h);
		
		p.fill(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]), Integer.parseInt(rgb[2]));
		
		if (this.hasText) {
			p.textFont(this.text);
			
			p.text(this.displayText, this.r.textPosX, this.r.textPosY);
		}
	}
}
