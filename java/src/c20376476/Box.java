package c20376476;
public class Box 
{
    Menu mv;
    float rotation = Menu.PI;

    public Box(Menu mv)
    {
        this.mv = mv; 
    }

    void draw() 
    {
        rotation += Menu.PI/100;
        mv.camera(mv.mouseX, mv.height/2, (mv.height/2) / Menu.tan(Menu.PI/6), mv.mouseX, mv.height/2, 0, 0, 1, 0);
        mv.translate(mv.width/2, mv.height/2, -100);
        mv.stroke(mv.getSmoothedAmplitude() * 1000, 255, 255);
        mv.noFill();
        mv.rotateX(rotation);
        mv.rotateY(rotation);
        mv.rotateZ(rotation);
        mv.box(mv.getSmoothedAmplitude() * 2500);
        mv.camera(mv.width/2, mv.height/2, (mv.height/2) / Menu.tan(Menu.PI/6), mv.width/2, mv.height/2, 0, 0, 1, 0);
    }
    
}
