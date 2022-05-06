package c20376476;

import ie.tudublin.*;
import c20407614.*;
import c20499732.*;

public class Menu extends Visual
{
    MayowasVisual m_v = new MayowasVisual(this);
    EmmanuelVisual e_v = new EmmanuelVisual(this);
    ProviesVisual p_v = new ProviesVisual(this);

    char mode;
    int M_mode;

    public void settings()
    {
        fullScreen(P3D, SPAN);
        //colorMode(RGB);
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("PharrellWilliamsHappy.mp3");
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if(key == 'e')
        {
            mode = 'e';
        }

        if(key == 'm')
        {
            mode = 'm';
        }

        if(key == 'p')
        {
            mode = 'p';
        }

        if((key >= '0' && key <= '9') && mode == 'm')
        {
                M_mode = Character.getNumericValue(key);
        }
    }

    public void draw()
    {
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

        background(0);

        textSize(25);
        textAlign(CENTER, CENTER);
        text("Press 'e' to see Emmanuel's visuals, 'm' to see Mayowa's visuals and 'p' to see Providence's visuals", width / 2, 50);

        switch(mode)
        {
            case 'e':
                e_v.setup();
                e_v.draw();
                break;

            case 'm':
                m_v.setup();
                m_v.draw(M_mode);
                break;

            case 'p':
                p_v.setup();
                p_v.draw();
                break;


        }
    }
    
}
