package c20376476;

public class Visualiser 
{
    Menu mv;

    public Visualiser(Menu mv)
    {
        this.mv = mv; 
    }
    
    void draw()
    {
        mv.stroke(255);
        mv.translate(400, 400);
        
        mv.getFFT().forward(mv.getAudioPlayer().mix);
        
        for(int i = 0; i < mv.getFFT().specSize(); i++)
        {
            mv.fill(mv.getSmoothedAmplitude() * 1000, 255, 255);
            mv.ellipse(i, 200, 7, mv.getFFT().getBand(i) * 10);
        }
    }
}
