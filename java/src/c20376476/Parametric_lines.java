package c20376476;

public class Parametric_lines 
{
    Menu mv;
    static final int NUM_LINES = 10;
    float rotation = Menu.PI;

    public Parametric_lines(Menu mv)
    {
        this.mv = mv; 
    }

    float x1(float t)
    {
        return Menu.sin(t/10) * 100 + Menu.sin(t/5) * 20;
    }

    float y1(float t)
    {
        return Menu.cos(t/10) * 100 + Menu.sin(t/5) * 50;
    }

    float x2(float t)
    {
        return Menu.sin(t/10) * 200 + Menu.sin(t) * 2;
    }

    float y2(float t)
    {
        return Menu.cos(t/20) * 200 + Menu.cos(t/12) * 20;
    }

    float x3(float t)
    {
        return -(Menu.sin(t/10) * 100 + Menu.sin(t/5) * 20);
    }

    float y3(float t)
    {
        return -(Menu.cos(t/10) * 100 + Menu.sin(t/5) * 50);
    }

    float x4(float t)
    {
        return -(Menu.sin(t/10) * 200 + Menu.sin(t) * 2);
    }

    float y4(float t)
    {
        return -(Menu.cos(t/20) * 200 + Menu.cos(t/12) * 20);
    }

    float draw(float t)
    {
        rotation += Menu.PI/100;
        mv.translate(mv.width/2, mv.height/2);
        mv.stroke(mv.getSmoothedAmplitude() * 1000, 255, 255);
        mv.noFill();
        mv.rotateX(rotation);
        mv.rotateY(rotation);
        mv.rotateZ(rotation);
        mv.box(mv.getSmoothedAmplitude() * 2500);

        mv.stroke(mv.getSmoothedAmplitude() * 1000, 255, 255);
        mv.strokeWeight(5);


        //mv.translate(mv.width/2, mv.height/2);

        for(int i = 0; i < NUM_LINES; i++)
        {
            mv.line(x1(t+i), y1(t+i), x2(t+i), y2(t+i));
            mv.line(x3(t+i), y3(t+i), x4(t+i), y4(t+i));
        }
        t += 0.5;

        return t;
    }
    
}
