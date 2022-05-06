package c20407614;

import processing.core.*;
import java.lang.Math;

public class Supershape {
    EmmanuelVisual ev;

    public Supershape(EmmanuelVisual ev)
    {
        this.ev = ev;
    }

    float t =0;
    

    public void draw()
    {
        ev.translate(ev.width /2, ev.height/2);
        ev.stroke(ev.getSmoothedAmplitude() * 1000, 255, 255);
        ev.noFill();
        ev.strokeWeight(2);

        
        ev.beginShape();

        for (float theta =0; theta <= 2* EmmanuelVisual.PI; theta += 0.001)
        {
            float rads = r(theta,
            2,
            2,
            20,
            1,
            (float)(Math.sin(ev.getSmoothedAmplitude()*10)+0.5),
            (float)(Math.cos(ev.getSmoothedAmplitude()*10)+0.5));
            float x = rads * EmmanuelVisual.cos(theta)* 50;
            float y = rads * EmmanuelVisual.sin(theta)* 50;
            ev.vertex(x, y);
        }

        ev.endShape();
    }

    float r(float theta,float a, float b, float m, float n1, float n2, float n3)
    {
        return (float) Math.pow(Math.pow(Math.abs(Math.cos(m * theta / 4.0) / a), n2)+
         Math.pow(Math.abs(Math.sin(m * theta / 4.0) / b),n3), -1.0 / n1);
    }
    
}
