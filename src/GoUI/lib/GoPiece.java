package GoUI.lib;

import processing.core.PFont;
import processing.core.PApplet;

public class GoPiece {
	public GoRect r;
	boolean isInitialized = false;
	boolean hasText = false;
	public boolean mLeftIsEnabled = true;
	public boolean mRightIsEnabled = false;
	
	public PFont text;
	public String displayText = "";
	public String Color = "";
	
	public String ID = "";
	
	/* Constructor
	 * Takes in Position and Dimensions
	 */
	public GoPiece(int x, int y, int w, int h) 
	{
		this.r = new GoRect(x, y, w, h);
		
		this.isInitialized = true;
	}
	public GoPiece(int x, int y, int w, int h, String Color)
	{
		this.r = new GoRect(x, y, w, h);
		this.Color = Color;
		
		this.isInitialized = true;
	}
	public GoPiece(int x, int y, int w, int h, String displayText, PFont text, String Color)
	{
		this.r = new GoRect(x, y, w, h);
		this.text = text;
		this.Color = Color;
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
		String[] rgb = Color.split(",");
		
		p.fill(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]), Integer.parseInt(rgb[2]));
		
		p.rect(r.x, r.y, r.w, r.h);
		
		if (this.hasText) {
			p.textFont(this.text);
			
			p.fill(33);
			
			p.text(this.displayText, this.r.textPosX, this.r.textPosY);
		}
	}
	
	public void AddToColor(int rp, int gp, int bp)
	{
		String[] rgb = Color.split(",");
		
		rgb[0] = String.valueOf(Integer.parseInt(rgb[0]) + rp);
		rgb[1] = String.valueOf(Integer.parseInt(rgb[1]) + gp);
		rgb[2] = String.valueOf(Integer.parseInt(rgb[2]) + bp);
		
		Color = String.join(",", rgb);
	}
}
