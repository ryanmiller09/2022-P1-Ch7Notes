package ExamplePic;

import java.awt.*;
import java.applet.*;

public class FruitBowl extends Applet{
    public void paint(Graphics g){
        Bowl.drawBowl(g);
        Bowl.drawTable(g);

        Apple.drawBody(g, 100, 100);
        Apple.drawStem(g, 100,100);
        Apple.drawLeaf(g, 100, 100);

        Banana.drawPeel(g);
        Banana.drawSlices(g);
        Banana.drawUncut(g);
        Banana.drawBrown(g);


    }

}
