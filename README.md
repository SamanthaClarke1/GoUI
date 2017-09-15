# Documentation of the GoUI Processing Library Ver: 0.1.1

## Setup
 * ### Installation
Setup for the GoUI is relatively easy. Just place the .jar that you download inside of your Processing libraries folder.
For windows users:

* C:\Users\owner\Documents\Processing\libraries
  + Add \GoUI_lib\library\GoUI.jar

If you are not a windows user, or just want to see further instructions, see this page:
https://github.com/processing/processing/wiki/How-to-Install-a-Contributed-Library

 * ### Basic Code
To start using the library, you'll want to initialize and import it.
```
import GoUI.lib.*;

void setup() {
  GoUI goui = new GoUI(this);
}
void draw() {

}
```

* ### Example Code
```
import GoUI.lib.*;

GoUI go;
String MyButtonId;
boolean mLeft = false;
boolean mRight = false;
String pieceA, pieceB;

void setup() 
{
  size(800, 800);
  go = new GoUI(this);
  
  PFont font = createFont("Arial", 32);
  
  pieceA = go.AddPiece(new GoButton(10, 10, 200, 200, "Drag Me!", font, "99,33,33"));
  pieceB = go.AddPiece(new GoButton(200, 200, 200, 200, "Drag Me!", font, "33,33,99"));
  
  frameRate(30);
}

void draw()
{
  background(66);
  
  ArrayList<String[]> hits = go.CheckPieces(mouseX, mouseY, mLeft, mRight);
  
  go.GetPieceById(pieceA).Color = "99,33,33";
  go.GetPieceById(pieceB).Color = "33,33,99";

  for(int i = 0; i < hits.size(); i++)  // for each object
  {
    if(hits.get(i)[1].equals("L")) // there was a left click hit on that object
    {
      String thispiece = hits.get(i)[0];
      go.GetPieceById(thispiece).r.Move(mouseX - pmouseX, mouseY - pmouseY);
      go.GetPieceById(thispiece).AddToColor(70, 70, 70);
    }
  }
  
  go.DrawPieces();
}

void mousePressed()
{
  if(mouseButton == LEFT) {
    mLeft = true;
    mRight = false;
  }
  if(mouseButton == RIGHT) {
    mRight = true;
    mLeft = false;
  } 
}

void mouseReleased()
{
  mLeft = false;
  mRight = false; 
}
```

#### Created by Samuel Clarke 09/2017
