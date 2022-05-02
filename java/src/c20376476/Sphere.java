package c20376476;

import processing.core.*;

public class Sphere 
{
    MayowasVisual mv;

    public Sphere(MayowasVisual mv)
    {
        this.mv = mv; 
    }

    void draw() 
    {
        mv.background(0);
        mv.translate(mv.width / 2, mv.height / 2, 0);
        if (mv.mousePressed) 
        {
            //mv.lights();
            mv.directionalLight(mv.getSmoothedAmplitude() * 1000, 255, 255, 0, -1, 0);
        }
        mv.stroke(255);
        mv.fill(255);
        mv.sphere(mv.getSmoothedAmplitude() * 2500);
    }
}
