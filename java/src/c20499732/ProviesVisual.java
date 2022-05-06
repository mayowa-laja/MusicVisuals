package c20499732;

import ie.tudublin.*;
import c20376476.*;

public class ProviesVisual
{
    Triangle t;
    Sphere s;
    Menu menu;

    public ProviesVisual(Menu menu)
    {
        this.menu = menu;
    }

    public void settings()
    {
        //size(1024, 500);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        //startMinim();
                
        // Call loadAudio to load an audio file to process 
        //loadAudio("heroplanet.mp3");   

        
        // Call this instead to read audio from the microphone
        //startListening();
        t = new Triangle(menu);
        s = new Sphere(menu);
    }

    public void draw()
    {
        menu.background(0);
        t.draw();   
        s.draw();        
    }
}
