package c20407614;

import processing.core.*;

public class Box 
{
    EmmanuelVisual ev;
    float rotation = EmmanuelVisual.PI;

    public Box(EmmanuelVisual ev)
    {
        this.ev = ev; 
    }

    void draw() 
    {
        rotation += EmmanuelVisual.PI/100;
        ev.background(0);
        ev.camera(ev.mouseX, ev.height/2, (ev.height/2) / EmmanuelVisual.tan(EmmanuelVisual.PI/6), ev.mouseX, ev.height/2, 0, 0, 1, 0);
        ev.translate(ev.width/2, ev.height/2, -100);
        ev.stroke(ev.getSmoothedAmplitude() * 1000, 255, 255);
        ev.noFill();
        ev.rotateX(rotation);
        ev.rotateY(rotation);
        ev.rotateZ(rotation);
        ev.box(ev.getSmoothedAmplitude() * 2500);
        ev.camera(ev.width/2, ev.height/2, (ev.height/2) / EmmanuelVisual.tan(EmmanuelVisual.PI/6), ev.width/2, ev.height/2, 0, 0, 1, 0);
    }
    
}