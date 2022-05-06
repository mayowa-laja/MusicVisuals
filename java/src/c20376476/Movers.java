package c20376476;

import processing.core.*;

public class Movers 
{
    Menu mv;

    public Movers(Menu mv)
    {
        this.mv = mv; 
    }

    // Creating an array of objects.
    Mover[] movers = new Mover[20];

    void setup() 
    {
        mv.smooth();
        // Initializing all the elements of the array
        for (int i = 0; i < movers.length; i++) 
        {
            movers[i] = new Mover();
        }
    }

    void draw() 
    {
        this.setup();
        mv.noStroke();
        mv.fill(255,10);
        mv.rect(0,0,mv.width,mv.height);

        // Calling functions of all of the objects in the array.
        for (int i = 0; i < movers.length; i++) 
        {
            movers[i].update();
            movers[i].checkEdges();
            movers[i].display();
        }
    }

    class Mover 
    {

        PVector location;
        PVector velocity;
        PVector acceleration;
        float topspeed;

        Mover() 
        {
            location = new PVector(mv.random(mv.width),mv.random(mv.height));
            velocity = new PVector(0,0);
            topspeed = 4;
        }

        void update() 
        {

            // Our algorithm for calculating acceleration:
            PVector mouse = new PVector(mv.mouseX,mv.mouseY);
            PVector dir = PVector.sub(mouse,location);  // Find vector pointing towards mouse
            dir.normalize();     // Normalize
            dir.mult(0.5f);       // Scale
            acceleration = dir;  // Set to acceleration

            // Motion 101!  Velocity changes by acceleration.  Location changes by velocity.
            velocity.add(acceleration);
            velocity.limit(topspeed);
            location.add(velocity);
        }

        void display() 
        {
            //mv.stroke(mv.getSmoothedAmplitude() * 1000, 255, 255);
            mv.stroke(0);
            mv.fill(mv.getSmoothedAmplitude() * 1000, 255, 255);
            mv.ellipse(location.x,location.y,16,16);
        }

        void checkEdges() 
        {

            if (location.x > mv.width) 
            {
                location.x = 0;
            } 
            else if (location.x < 0) 
            {
                location.x = mv.width;
            }

            if (location.y > mv.height) 
            {
                location.y = 0;
            }  
            else if (location.y < 0) 
            {
                location.y = mv.height;
            }

        }

    }
}
