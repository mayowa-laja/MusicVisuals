package c20499732;
import c20376476.*;

public class Triangle 
{
    Menu pv;

    public Triangle(Menu pv)
    {
        this.pv = pv; 
    }

    public void draw()
    {
        pv.background(0);

        pv.translate(pv.width/7, pv.height/7, 0);
        pv.stroke(255);
        pv.rotateX(Menu.PI/2);
        pv.rotateZ(-Menu.PI/6);
        pv.noFill();

        pv.beginShape();
        pv.vertex(-100, -100, -100);
        pv.vertex( 100, -100, -100);
        pv.vertex(   0,    0,  100);

        pv.vertex( 100, -100, -100);
        pv.vertex( 100,  100, -100);
        pv.vertex(   0,    0,  100);

        pv.vertex( 100, 100, -100);
        pv.vertex(-100, 100, -100);
        pv.vertex(   0,   0,  100);

        pv.vertex(-100,  100, -100);
        pv.vertex(-100, -100, -100);
        pv.vertex(   0,    0,  100);
        
        pv.camera(pv.mouseX, pv.height/-2, (pv.height/-2) /Menu.tan(Menu.PI/6), pv.mouseX, pv.height/2, 0, 0, 1, 0);
        pv.translate(pv.width/2, pv.height/2, -100);
        pv.stroke(255);
        pv.noFill();
       
       
        pv.endShape();


    }
    
}
