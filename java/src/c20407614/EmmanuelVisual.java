package c20407614;

import ie.tudublin.*;

public class EmmanuelVisual extends Visual 
{
    Box b;
    Supershape s;
    int mode= 0;

    public void settings()
    {
        //size(1024, 500);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("PharrellWilliamsHappy.mp3");   

        
        // Call this instead to read audio from the microphone
        //startListening(); 
        b = new Box(this);
        s = new Supershape(this);


    }

    public void keyPressed()
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
    }

    public void draw()
    {
        background(0);
        //try
        //{
          //  // Call this if you want to use FFT data
            //calculateFFT(); 
       // }
       // catch(VisualException e)
        //{
         //   e.printStackTrace();
        //}
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();    

        switch(mode)
        {
            case 0:
                background(0);
                s.draw();
                break;
            


        }
    }

}
