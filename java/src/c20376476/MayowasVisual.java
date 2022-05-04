package c20376476;

import ie.tudublin.*;

public class MayowasVisual extends Visual
{
    Waves wf;
    AudioBands abv;
    Movers m;
    Box b;
    Sphere s;
    int mode = 0;

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
        
        wf = new Waves(this);
        abv = new AudioBands(this);
        m = new Movers(this);
        b = new Box(this);
        s = new Sphere(this);

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
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
        
        /*fill(255, 165, 0);
        stroke(0, 255, 255);
        rect(width * 0.25f, height * 0.25f, (width / 2), (height / 2) * 0.33f);
        text("Emmanuel", (width * 0.25f) + ((width / 2) / 2), );
        fill(0, 128, 0);
        rect(width * 0.25f, (height * 0.25f) + (height / 2) * 0.33f, (width / 2), (height / 2) * 0.33f);
        fill(234, 221, 202);
        rect(width * 0.25f, (height * 0.25f) + ((height / 2) * 0.33f  * 2), (width / 2), (height / 2) * 0.33f);*/



        switch(mode)
        {
            case 0:
                background(0);
                wf.render();
                break;

            case 1:
                background(0);
                abv.render();
                break;

            case 2:
                background(0);
                m.draw();
                break;

            case 3:
                background(0);
                b.draw();
                break;

            case 4:
                background(0);
                s.draw();
                break;


        }
    }
}
