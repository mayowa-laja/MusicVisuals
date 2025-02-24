package c20499732;
import c20376476.*;

public class Sphere {
    Menu pv;

    public Sphere(Menu pv)
    {
        this.pv = pv; 
    }

    void draw() 
    {
        pv.translate(pv.width / 2, pv.height / 2, 0);
        if (pv.mousePressed) 
        {
            //mv.lights();
            pv.directionalLight(pv.getSmoothedAmplitude() * 1000, 255, 255, 0, -1, 0);
        }
        pv.stroke(255);
        pv.fill(255);
        pv.sphere(pv.getSmoothedAmplitude() * 2500);
    }
}
