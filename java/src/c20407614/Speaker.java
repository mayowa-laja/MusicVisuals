package c20407614;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class Speaker
{
    EmmanuelVisual ev;

    public Speaker(EmmanuelVisual ev)
    {
        this.ev = ev; 
    }

    public void render()
    {
        float gap = ev.width / (float) ev.getBands().length;
        ev.noStroke();
        for(int i = 0 ; i < ev.getBands().length ; i ++)
        {
            ev.fill(PApplet.map(i, 0, ev.getBands().length, 255, 0), 255, 255);
            ev.rect(i * gap, ev.height, gap,-ev.getSmoothedBands()[i] * 0.2f); 
        }
    }
}