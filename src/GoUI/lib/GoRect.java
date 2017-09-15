package GoUI.lib;


public class GoRect
{
	public int pad = 10;
	
	public int x;
	public int y;
	public int w;
	public int h;
	
	public int top;
	public int right;
	public int bot;
	public int left;
	
	public int textPosX;
	public int textPosY;
	
	public GoRect(int x, int y, int w, int h) 
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		this.top = y;
		this.right = x + w;
		this.bot = y + h;
		this.left = x;
		
		this.textPosX = this.x + this.pad;
		this.textPosY = (this.h / 2) + this.y;
	}
	
	public void Set(int x, int y) 
	{
		this.x = x;
		this.y = y;
		
		RecalcPlaces();
	}
	
	public void Setm(int x, int y)
	{
		this.x = x - (w / 2);
		this.y = y - (h / 2);
		
		RecalcPlaces();
	}
	
	public void Mult(int scalew, int scaleh)
	{
		this.w *= scalew;
		this.h *= scaleh;
		
		RecalcPlaces();
	}
	
	public void Mult(int scale) 
	{
		this.w *= scale;
		this.h *= scale;
		
		RecalcPlaces();
	}
	
	public void Move(int xadd, int yadd)
	{
		this.x += xadd;
		this.y += yadd;
		
		RecalcPlaces();
	}
	
	public void RecalcPlaces()
	{
		this.top = y;
		this.right = x + w;
		this.bot = y + h;
		this.left = x;
		
		this.textPosX = this.x + this.pad;
		this.textPosY = (this.h / 2) + this.y;
	}
}
