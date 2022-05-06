package c20407614;

import processing.core.*;
import java.lang.Math;
import c20376476.*;

public class Supershape {
    EmmanuelVisual ev;
    Menu menu;

    public Supershape(Menu menu)
    {
        this.menu = menu;
    }

    float t =0;
    

    public void draw()
    {
        menu.translate(menu.width /2, menu.height/2);
        menu.stroke(menu.getSmoothedAmplitude() * 1000, 255, 255);
        menu.noFill();
        menu.strokeWeight(2);

        
        menu.beginShape();

        for (float theta =0; theta <= 2* Menu.PI; theta += 0.001)
        {
            float rads = r(theta,
            2,
            2,
            20,
            1,
            (float)(Math.sin(menu.getSmoothedAmplitude()*10)+0.5),
            (float)(Math.cos(menu.getSmoothedAmplitude()*10)+0.5));
            float x = rads * Menu.cos(theta)* 50;
            float y = rads * Menu.sin(theta)* 50;
            menu.vertex(x, y);
        }

        menu.endShape();
    }

    float r(float theta,float a, float b, float m, float n1, float n2, float n3)
    {
        return (float) Math.pow(Math.pow(Math.abs(Math.cos(m * theta / 4.0) / a), n2)+
         Math.pow(Math.abs(Math.sin(m * theta / 4.0) / b),n3), -1.0 / n1);
    }
    
}
