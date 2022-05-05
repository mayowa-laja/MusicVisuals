package c20376476;

public class Parametric_lines 
{
    Menu mv;
    float t;

    public Parametric_lines(Menu mv)
    {
        this.mv = mv; 
    }

    void setup()
    {
        mv.background(0);
    }

    float x(float t)
    {
        return t;
    }

    float y(float t)
    {
        return -t;
    }

    void draw()
    {
        mv.stroke(255);
        mv.strokeWeight(5);
        mv.translate(mv.width/2, mv.height/2);
        mv.point(x(t), y(t));
        t++;
    }
    
}
