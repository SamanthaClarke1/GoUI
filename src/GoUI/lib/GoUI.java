/**
 * A library to aid in the creation of GUI's in processing
 *
 * ##copyright##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author		Samuel Clarke
 * @modified	14/09/2017
 * @version		0.1.1
 */

package GoUI.lib;
import java.util.*;

import processing.core.*;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * @example Hello 
 * 
 * (the tag @example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 */

public class GoUI 
{
	
	// myParent is a reference to the parent sketch
	PApplet myParent;
	
	ArrayList<GoPiece> pieces = new ArrayList<GoPiece>();
	
	public final static String VERSION = "0.1.1";
	

	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the library.
	 * 
	 * @example Hello
	 * @param theParent
	 */
	public GoUI(PApplet theParent)
	{
		myParent = theParent;
		welcome();
	}
	
	public ArrayList<String[]> CheckPieces(int mouseX, int mouseY, boolean mLeft, boolean mRight)
	{
		ArrayList<String[]> retvals = new ArrayList<String[]>();
		
		for(int i = 0; i < pieces.size(); i++) {
			String checkResult = pieces.get(i).Check(mouseX, mouseY, mLeft, mRight);
			String pieceId = pieces.get(i).ID;
			
			retvals.add(new String[] {pieceId, checkResult});
		}
		
		return retvals;
	}
	
	public GoPiece GetPieceById(String tid)
	{
		GoPiece pieceToReturn = null;
		
		for (int i = 0; i < pieces.size(); i++)
		{
			if(pieces.get(i).ID.equals(tid))
			{
				pieceToReturn = pieces.get(i);
			}
		}
		
		if(pieceToReturn != null) {
			return pieceToReturn;
		}
		return null;
	}
	
	public String AddPiece(GoPiece p)
	{
		String ID = generateId();
		p.ID = ID;
		
		pieces.add(p);
	
		return ID;
	}
	
	public void DrawPieces()
	{
		for(int i = 0; i < pieces.size(); i++)
		{
			pieces.get(i).Draw(this.myParent);
		}
	}
	
	private void welcome()  // welcome function, called by GoUI constructor
	{
		System.out.println("-- GoUI " + VERSION + " by Samuel Clarke --");
	}
	
	
	public String SayHello() // hello!
	{
		return "Hello lib!";
	}
	/**
	 * return the version of the library.
	 * 
	 * @return "0.1.1"
	 */
	public String Version() // returns the current version
	{
		return VERSION;
	}
	
	private String generateId()
	{
		String ID = "";
		
		for(int i = 0; i < 11; i++) {
			Random ran = new Random();
			int random = ran.nextInt(10);
			
			ID += random;
		}
		
		return ID;
	}
}

