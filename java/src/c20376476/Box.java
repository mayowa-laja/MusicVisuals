package c20376476;

import processing.core.*;

public class Box 
{
    MayowasVisual mv;
    float rotation = MayowasVisual.PI;

    public Box(MayowasVisual mv)
    {
        this.mv = mv; 
    }

    void draw() 
    {
        rotation += MayowasVisual.PI/100;
        mv.background(0);
        mv.camera(mv.mouseX, mv.height/2, (mv.height/2) / MayowasVisual.tan(MayowasVisual.PI/6), mv.mouseX, mv.height/2, 0, 0, 1, 0);
        mv.translate(mv.width/2, mv.height/2, -100);
        mv.stroke(mv.getSmoothedAmplitude() * 1000, 255, 255);
        mv.noFill();
        mv.rotateX(rotation);
        mv.rotateY(rotation);
        mv.rotateZ(rotation);
        mv.box(mv.getSmoothedAmplitude() * 2500);
        mv.camera(mv.width/2, mv.height/2, (mv.height/2) / MayowasVisual.tan(MayowasVisual.PI/6), mv.width/2, mv.height/2, 0, 0, 1, 0);
    }
    
}
