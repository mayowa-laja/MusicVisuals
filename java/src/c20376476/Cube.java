package c20376476;

public class Cube 
{
    Menu mv;

    public Cube(Menu mv)
    {
        this.mv = mv;
    }

    void draw() 
    {
        mv.background(0);
        mv.translate(mv.width / 2, mv.height / 2);
        
        // Orange point light on the right
        mv.pointLight(mv.getSmoothedAmplitude(), 255, 255, // Color
                   200, -150, 0); // Position
      
        // Blue directional light from the left
        mv.directionalLight(mv.getSmoothedAmplitude(), 255, 255, // Color
                         1, 0, 0); // The x-, y-, z-axis direction
      
        // Yellow spotlight from the front
        mv.spotLight(mv.getSmoothedAmplitude(), 255f, 255f, // Color
                  0f, 40f, 200f, // Position
                  0f, -0.5f, -0.5f, // Direction
                  Menu.PI / 2f, 2f); // Angle, concentration
        
        mv.rotateY(Menu.map(mv.mouseX, 0, mv.width, 0, Menu.PI));
        mv.rotateX(Menu.map(mv.mouseY, 0, mv.height, 0, Menu.PI));
        mv.box(150);
      }
    
}
