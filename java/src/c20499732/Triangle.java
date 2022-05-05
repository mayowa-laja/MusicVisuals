package c20499732;

public class Triangle 
{
    ProviesVisual pv;

    public Triangle(ProviesVisual pv)
    {
        this.pv = pv;
    }

    public void draw()
    {
        pv.background(0);

        pv.translate(pv.width/7, pv.height/7, 0);
        pv.stroke(255);
        pv.rotateX(pv.PI/2);
        pv.rotateZ(-pv.PI/6);
        pv.noFill();

        pv.beginShape();
        pv.vertex(-100, -100, -100);
        pv.vertex( 100, -100, -100);
        pv.vertex(   0,    0,  100);

        pv.vertex( 100, -100, -100);
        pv.vertex( 100,  100, -100);
        pv.vertex(   0,    0,  100);

        pv.vertex( 100, 100, -100);
        pv.vertex(-100, 100, -100);
        pv.vertex(   0,   0,  100);

        pv.vertex(-100,  100, -100);
        pv.vertex(-100, -100, -100);
        pv.vertex(   0,    0,  100);
        
        pv.camera(pv.mouseX, pv.height/-2, (pv.height/-2) / pv.tan(pv.PI/6), pv.mouseX, pv.height/2, 0, 0, 1, 0);
        pv.translate(pv.width/2, pv.height/2, -100);
        pv.stroke(255);
        pv.noFill();
       
       
        pv.endShape();


    }
    
}
