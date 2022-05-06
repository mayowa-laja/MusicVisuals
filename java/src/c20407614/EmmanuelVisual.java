package c20407614;

import ie.tudublin.*;
import c20376476.*;

public class EmmanuelVisual
{
    //Box b;
    Menu menu;
    Supershape s;
    int mode= 0;

    public EmmanuelVisual(Menu menu)
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
        /*startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("PharrellWilliamsHappy.mp3");  */ 

        
        // Call this instead to read audio from the microphone
        //startListening(); 
        //b = new Box(this);
        s = new Supershape(menu);


    }

    /*public void keyPressed()
    {
        if(key >= '0' && key <= '9')
        {
            mode = Character.getNumericValue(key);
        }

        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }*/

    public void draw()
    {   //try
        //{
          //  // Call this if you want to use FFT data
            //calculateFFT(); 
       // }
       // catch(VisualException e)
        //{
         //   e.printStackTrace();
        //}  

        
        menu.background(0);
        s.draw();
    }

}
